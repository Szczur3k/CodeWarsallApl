package CountVowels;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VowelsTest {

    @Test
    public void shouldReturn7Vowels(){

        //Given
        String someSentence = "Co z Ciebie za cwel";

        //When
        int countedVowels = Vowels.getCount(someSentence);

        //Then
        assertThat(countedVowels).isEqualTo(7);
    }


}