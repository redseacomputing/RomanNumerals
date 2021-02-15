import org.junit.jupiter.api.BeforeEach;
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

}