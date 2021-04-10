package TheOfficeIIIBrokenPhotocopier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BrokenPhotocopierTest {

    @Test
    public void tests() {
        // assertEquals("expected", "actual");
        assertEquals("01111111010010000001100110111", BrokenPhotocopier.broken("10000000101101111110011001000"));
        assertEquals("0", BrokenPhotocopier.broken("1"));
        assertEquals("011101", BrokenPhotocopier.broken("100010"));
    }

    @Test
    public void shouldReturnReverseSequence(){
        //Given
        String someString = "100010101110001010101";
        String expectedString = "011101010001110101010";

        //When
        String result = BrokenPhotocopier.broken(someString);

        //Then
        assertThat(result).isEqualTo(expectedString);
    }

}