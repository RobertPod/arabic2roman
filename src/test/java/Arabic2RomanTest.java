import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class Arabic2RomanTest {

    private Arabic2Roman arabic2Roman;

    @BeforeEach
    void setUp() {
        arabic2Roman = new Arabic2Roman();
    }

    @ParameterizedTest
    @CsvSource({"1,I",
            "2,II",
            "4,IV",
            "5,V",
            "6,VI",
            "8,VIII",
            "11,XI",
            "12,XII",
            "30,XXX",
            "32,XXXII",
            "40,XL",
            "723,DCCXXIII",
            "3000,MMM"})
    void shouldReturnProperlyResult(int input, String expected) {
        assertThat(arabic2Roman.convert(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3001})
    void shouldReturnExceptionWhenNumberIsNotInRange(int incorrectInput) {
        assertThrows(IllegalArgumentException.class, () -> arabic2Roman.convert(incorrectInput));
    }
}