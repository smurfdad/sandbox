package es.smurfdad.sandbox.pepebuilder;

import java.io.Serializable;

public class Pepe implements Serializable {

    private String value1;

    private Double value2;

    private Float value3;

    private Integer value4;

    public String getValue1() {
        return this.value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public Double getValue2() {
        return this.value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public Float getValue3() {
        return this.value3;
    }

    public void setValue3(Float value3) {
        this.value3 = value3;
    }

    public Integer getValue4() {
        return this.value4;
    }

    public void setValue4(Integer value4) {
        this.value4 = value4;
    }

}
