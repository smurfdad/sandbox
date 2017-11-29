package es.smurfdad.sandbox.pepebuilder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

import org.junit.Test;

public class PepeBuilderTest {

    @Test
    public void test() {
        Pepe resultado = PepeBuilder.create().withValue1("1").withValue2(2d).withValue3(3f).withValue4(4).build();
        assertThat(resultado, samePropertyValuesAs(getPepe()));
    }

    @Test
    public void testConSobrecarga() {
        Pepe resultado = PepeBuilder.create().withValue1("1").withValue2("2").withValue3("3").withValue4("4").build();
        assertThat(resultado, samePropertyValuesAs(getPepe()));
    }

    public static Pepe getPepe() {
        Pepe out = new Pepe();
        out.setValue1("1");
        out.setValue2(2d);
        out.setValue3(3f);
        out.setValue4(4);
        return out;
    }
}
