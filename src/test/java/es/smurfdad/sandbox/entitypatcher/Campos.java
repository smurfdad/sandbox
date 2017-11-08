package es.smurfdad.sandbox.entitypatcher;

import static java.text.MessageFormat.format;
import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import es.smurfdad.sandbox.entities.GenericEntity;

public enum Campos {

    VALUE1((a, b) -> !equalsIgnoreCase(a.getValue1(), b.getValue1()), (a, b) -> getMessage("value1", a.getValue1(), b.getValue1())),
    VALUE2((a, b) -> !equalsIgnoreCase(a.getValue2(), b.getValue2()), (a, b) -> getMessage("value2", a.getValue2(), b.getValue2())),
    VALUE3((a, b) -> !equalsIgnoreCase(a.getValue3(), b.getValue3()), (a, b) -> getMessage("value3", a.getValue3(), b.getValue3())),
    VALUE4((a, b) -> !equalsIgnoreCase(a.getValue4(), b.getValue4()), (a, b) -> getMessage("value4", a.getValue4(), b.getValue4())),
    VALUE5((a, b) -> !equalsIgnoreCase(a.getValue5(), b.getValue5()), (a, b) -> getMessage("value5", a.getValue5(), b.getValue5()));

    private static final String MESSAGE = "El atributo {0} antes tenia el valor {1} y ahora tiene el valor {2}";

    private static String getMessage(String campo, String valorInicial, String valorFinal) {
        return format(MESSAGE, campo, valorInicial, valorFinal);
    }

    private BiPredicate<GenericEntity, GenericEntity> condition;

    private BiFunction<GenericEntity, GenericEntity, String> funcion;

    private Campos(BiPredicate<GenericEntity, GenericEntity> condition, BiFunction<GenericEntity, GenericEntity, String> funcion) {
        this.condition = condition;
        this.funcion = funcion;
    }

    public BiPredicate<GenericEntity, GenericEntity> getCondition() {
        return this.condition;
    }

    public BiFunction<GenericEntity, GenericEntity, String> getFuncion() {
        return this.funcion;
    }

}
