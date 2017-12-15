package es.smurfdad.sandbox.entitypatcher.functions;

import static java.text.MessageFormat.format;

public class GetMessageFunction {

    private static final String MESSAGE = "El atributo {0} antes tenia el valor {1} y ahora tiene el valor {2}";

    private static String getMessage2(String campo, String valorInicial, String valorFinal) {
        return format(MESSAGE, campo, valorInicial, valorFinal);
    }

    public static final FunctionValue value1Function = new FunctionValue1();

    public static final FunctionValue value2Function = (a, b) -> getMessage2("value2", a.getValue2(), b.getValue2());

    public static final FunctionValue value3Function = (a, b) -> getMessage2("value3", a.getValue3(), b.getValue3());

    public static final FunctionValue value4Function = (a, b) -> getMessage2("value4", a.getValue4(), b.getValue4());

    public static final FunctionValue value5Function = (a, b) -> getMessage2("value5", a.getValue5(), b.getValue5());
}
