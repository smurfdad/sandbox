package es.smurfdad.sandbox.entitypatcher.functions;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

public class GetMessagePredicate {

    public static final GenericEntitiesPredicate value1Condition = (a, b) -> !equalsIgnoreCase(a.getValue1(), b.getValue1());

    public static final GenericEntitiesPredicate value2Condition = (a, b) -> !equalsIgnoreCase(a.getValue2(), b.getValue2());

    public static final GenericEntitiesPredicate value3Condition = (a, b) -> !equalsIgnoreCase(a.getValue3(), b.getValue3());

    public static final GenericEntitiesPredicate value4Condition = (a, b) -> !equalsIgnoreCase(a.getValue4(), b.getValue4());

    public static final GenericEntitiesPredicate value5Condition = (a, b) -> !equalsIgnoreCase(a.getValue5(), b.getValue5());

}
