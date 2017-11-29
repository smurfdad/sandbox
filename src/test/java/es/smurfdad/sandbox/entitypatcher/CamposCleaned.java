package es.smurfdad.sandbox.entitypatcher;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import es.smurfdad.sandbox.entities.GenericEntity;
import es.smurfdad.sandbox.entitypatcher.functions.GetMessageFunction;
import es.smurfdad.sandbox.entitypatcher.functions.GetMessagePredicate;

public enum CamposCleaned {

    VALUE1(GetMessagePredicate.value1Condition, GetMessageFunction.value1Function),
    VALUE2(GetMessagePredicate.value2Condition, GetMessageFunction.value2Function),
    VALUE3(GetMessagePredicate.value3Condition, GetMessageFunction.value3Function),
    VALUE4(GetMessagePredicate.value4Condition, GetMessageFunction.value4Function),
    VALUE5(GetMessagePredicate.value5Condition, GetMessageFunction.value5Function);

    private BiPredicate<GenericEntity, GenericEntity> condition;

    private BiFunction<GenericEntity, GenericEntity, String> funcion;

    private CamposCleaned(BiPredicate<GenericEntity, GenericEntity> condition, BiFunction<GenericEntity, GenericEntity, String> funcion) {
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
