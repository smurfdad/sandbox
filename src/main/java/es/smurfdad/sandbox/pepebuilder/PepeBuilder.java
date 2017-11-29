package es.smurfdad.sandbox.pepebuilder;

import org.apache.commons.lang3.builder.Builder;

public class PepeBuilder implements Builder<Pepe> {

    private String value1;

    private Double value2;

    private Float value3;

    private Integer value4;

    public static PepeBuilder create() {
        return new PepeBuilder();
    }

    @Override
    public Pepe build() {
        Pepe out = new Pepe();
        out.setValue1(this.value1);
        out.setValue2(this.value2);
        out.setValue3(this.value3);
        out.setValue4(this.value4);
        return out;
    }

    public PepeBuilder withValue1(String value1) {
        this.value1 = value1;
        return this;
    }

    public PepeBuilder withValue2(Double value2) {
        this.value2 = value2;
        return this;
    }

    public PepeBuilder withValue2(String value2) {
        this.value2 = Double.valueOf(value2);
        return this;
    }

    public PepeBuilder withValue3(Float value3) {
        this.value3 = value3;
        return this;
    }

    public PepeBuilder withValue3(String value3) {
        this.value3 = Float.valueOf(value3);
        return this;
    }

    public PepeBuilder withValue4(Integer value4) {
        this.value4 = value4;
        return this;
    }

    public PepeBuilder withValue4(String value4) {
        this.value4 = Integer.valueOf(value4);
        return this;
    }

}
