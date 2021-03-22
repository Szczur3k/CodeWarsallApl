package ReverseSentence;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpinWordsTest {

    @Test
    public void shouldReturnSpinnedSentence(){

        //Given
        SpinWords spinWords = new SpinWords();
        String sentence = "someee sentence";

        //When
        String spinnedSentence = spinWords.spinWords(sentence);

        //Then
        assertThat(spinnedSentence).isEqualTo("eeemos ecnetnes");

    }

    @Test
    public void shouldReturnNotSpinnedSentence(){

        //Given
        SpinWords spinWords = new SpinWords();
        String sentence = "some sent";

        //When
        String spinnedSentence = spinWords.spinWords(sentence);

        //Then
        assertThat(spinnedSentence).isEqualTo("some sent");

    }

}