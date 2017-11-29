package es.smurfdad.sandbox.entitypatcher.functions;

import static java.text.MessageFormat.format;

import java.util.function.BiFunction;

import es.smurfdad.sandbox.entities.GenericEntity;

public class GetMessageFunction {

    private static final String MESSAGE = "El atributo {0} antes tenia el valor {1} y ahora tiene el valor {2}";

    private static String getMessage(String campo, String valorInicial, String valorFinal) {
        return format(MESSAGE, campo, valorInicial, valorFinal);
    }

    public static BiFunction<GenericEntity, GenericEntity, String> value1Function = new FunctionValue1();

    public static BiFunction<GenericEntity, GenericEntity, String> value2Function = (a,
            b) -> getMessage("value2", a.getValue2(), b.getValue2());

    public static BiFunction<GenericEntity, GenericEntity, String> value3Function = (a,
            b) -> getMessage("value3", a.getValue3(), b.getValue3());

    public static BiFunction<GenericEntity, GenericEntity, String> value4Function = (a,
            b) -> getMessage("value4", a.getValue4(), b.getValue4());

    public static BiFunction<GenericEntity, GenericEntity, String> value5Function = (a,
            b) -> getMessage("value5", a.getValue5(), b.getValue5());
}
