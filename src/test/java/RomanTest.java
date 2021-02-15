import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {

    Roman roman;

    @BeforeEach
    void setUp() {
        roman = new Roman();
    }

    @Test
    void shouldConvertITo1() {
        assertEquals(1, roman.toArabic("I"));
    }

    @Test
    void shouldConvertVto5() {
        assertEquals(5, roman.toArabic("V"));
    }

    @Test
    void shouldConvertXTo10() {
        assertEquals(10, roman.toArabic("X"));
    }

    @Test
    void shouldConvertIITo2() {
        assertEquals(2, roman.toArabic("II"));
    }
    @Test
    void shouldConvertXXXVIIITo38() {
        assertEquals(38, roman.toArabic("XXXVIII"));
    }

    @Test
    void shouldConvertIVTo4() {
        assertEquals(4, roman.toArabic("IV"));
    }
}