package es.smurfdad.sandbox.entitypatcher.functions;

import static java.text.MessageFormat.format;

import java.util.function.BiFunction;

import es.smurfdad.sandbox.entities.GenericEntity;

public interface FunctionValue extends BiFunction<GenericEntity, GenericEntity, String> {

    public static final String MESSAGE = "El atributo {0} antes tenia el valor {1} y ahora tiene el valor {2}";

    default String getMessage(String campo, String valorInicial, String valorFinal) {
        return format(MESSAGE, campo, valorInicial, valorFinal);
    }

}
