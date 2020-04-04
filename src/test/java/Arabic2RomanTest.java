import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Arabic2RomanTest {

    @Test
    void should1GiveI() {
        //given
        Arabic2Roman arabic2Roman = new Arabic2Roman();
        // when
        int arabic = 1;
        // then
        assertThat(arabic2Roman.convert(arabic)).isEqualTo("I");
    }
}