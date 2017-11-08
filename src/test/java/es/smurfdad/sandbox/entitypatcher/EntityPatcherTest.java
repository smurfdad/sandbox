package es.smurfdad.sandbox.entitypatcher;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.stream.Stream;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import es.smurfdad.sandbox.Application;
import es.smurfdad.sandbox.entities.GenericEntity;
import es.smurfdad.sandbox.repositories.GenericEntityRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class EntityPatcherTest {

    @Autowired
    private GenericEntityRepository repository;

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
        GenericEntity entity = new GenericEntity();
        entity.setValue1("test");
        GenericEntity genericEntity = this.repository.save(entity);
        GenericEntity foundEntity = this.repository.findOne(genericEntity.getId());
        assertNotNull(foundEntity);
        assertEquals(genericEntity.getValue1(), foundEntity.getValue1());
    }

    @Test
    public void testDatasAreLoaded() {

        assertThat("Initial load count", this.repository.count(), equalTo(5L));
    }

    @Test
    public void discoveringDifferences() {
        GenericEntity entity = this.repository.findOne(Long.valueOf(1));
        // Clonamos el original
        GenericEntity origin = ObjectUtils.clone(entity);

        // Actualizamos la entidad, que tendra el estado final
        entity.setValue2("test");
        entity.setValue4("pepe");
        this.repository.save(entity);

        // Nos aseguramos que son objetos diferentes
        assertThat("Object has been cloned", origin, notNullValue());
        assertThat("Both entities are differents", origin, not(sameInstance(entity)));
        assertThat("Attribute has not updated", origin.getValue2(), not(equalTo(entity.getValue2())));

        // Procesamos los cambios de los campos
        assertThat(
                Stream.of(Campos.values()).filter(campo -> campo.getCondition().test(origin, entity))
                        .map(campo -> campo.getFuncion().apply(origin, entity)).collect(toList()),
                contains(
                        "El atributo value2 antes tenia el valor 1-2 y ahora tiene el valor test",
                        "El atributo value4 antes tenia el valor 1-4 y ahora tiene el valor pepe"));
    }

}
