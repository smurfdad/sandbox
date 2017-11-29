package es.smurfdad.sandbox.entitypatcher.functions;

import es.smurfdad.sandbox.entities.GenericEntity;

public class FunctionValue1 extends FunctionValue {

    @Override
    public String apply(GenericEntity a, GenericEntity b) {
        return getMessage("value1", a.getValue1(), b.getValue1());
    }
}
