package es.smurfdad.sandbox.entitypatcher.functions;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

import java.util.function.BiPredicate;

import es.smurfdad.sandbox.entities.GenericEntity;

public class GetMessagePredicate {

    public static BiPredicate<GenericEntity, GenericEntity> value1Condition = (a, b) -> !equalsIgnoreCase(a.getValue1(), b.getValue1());

    public static BiPredicate<GenericEntity, GenericEntity> value2Condition = (a, b) -> !equalsIgnoreCase(a.getValue2(), b.getValue2());

    public static BiPredicate<GenericEntity, GenericEntity> value3Condition = (a, b) -> !equalsIgnoreCase(a.getValue3(), b.getValue3());

    public static BiPredicate<GenericEntity, GenericEntity> value4Condition = (a, b) -> !equalsIgnoreCase(a.getValue4(), b.getValue4());

    public static BiPredicate<GenericEntity, GenericEntity> value5Condition = (a, b) -> !equalsIgnoreCase(a.getValue5(), b.getValue5());

}
