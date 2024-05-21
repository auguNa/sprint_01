package s01_04.n2ejercicio1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class StringLengthMatcherTest {
    @Test
    public void testStringLength() {
        String str = "Mordor";
        assertThat(str, StringLengthMatcher.hasLength(6));
    }
}