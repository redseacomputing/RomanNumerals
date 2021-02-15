import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldConvertITo1() {
        Roman roman = new Roman();
        assertEquals(1, roman.toArabic("I"));
    }

}