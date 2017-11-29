package es.smurfdad.sandbox;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import es.smurfdad.sandbox.Application;
import es.smurfdad.sandbox.entities.ChildEntity;
import es.smurfdad.sandbox.entities.GenericEntity;
import es.smurfdad.sandbox.repositories.ChildEntityRepository;
import es.smurfdad.sandbox.repositories.GenericEntityRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class EntityCascadeRemoveTest {

    @Autowired
    private GenericEntityRepository mainRepository;

    @Autowired
    private ChildEntityRepository childRepository;

    @Test
    public void testFetchChildren() {
        GenericEntity entity = this.mainRepository.findOne(1L);
        assertThat(entity, notNullValue());
        assertThat(entity.getChildren(), not(empty()));

        this.mainRepository.delete(entity);
        assertThat(this.childRepository.existsByParent(1L), equalTo(false));
        List<ChildEntity> children = this.childRepository.findAll();
        assertThat(children, not(empty()));
        children.stream().forEach(child -> assertThat(child.getParent(), not(equalTo(1L))));

    }

}
