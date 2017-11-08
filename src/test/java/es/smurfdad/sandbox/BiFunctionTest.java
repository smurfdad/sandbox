package es.smurfdad.sandbox;

import static org.junit.Assert.assertEquals;

import java.util.function.BiFunction;

import org.junit.Test;

public class BiFunctionTest {

    @Test
    public void testBiFunction() {

        BiFunction<String, String, String> bifunction = (x, y) -> x.concat(y);

        assertEquals("hola mundo", bifunction.apply("hola ", "mundo"));
    }

    @Test
    public void testBiFunctionStream() {

        BiFunction<String, String, String> bifunction = (x, y) -> x.concat(y);

        assertEquals("hola mundo", bifunction.apply("hola ", "mundo"));
    }

}
