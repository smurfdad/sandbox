package es.smurfdad.sandbox.multilineutil;

import static es.smurfdad.sandbox.multilineutil.MultiLineUtil.toMultiLine;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class MultiLineUtilTest {

    @Test
    public void if_null_return_empty_list() {
        List<String> resultado = toMultiLine(null, 10);
        assertThat(resultado, nullValue());
    }

}
