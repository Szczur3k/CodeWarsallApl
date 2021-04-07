package HighestScoringWord;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class HighestScoringWordTest {

    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.hight("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.hight("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.hight("take me to semynak"));
    }

    @Test
    public void shouldReturnTheLongestWord(){
        //Given
        String someString = "I am the longest";
        String expected = "longest";

        //When
        String result = HighestScoringWord.hight(someString);

        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnNoWord(){
        //Given
        String someString = "";
        String expected = "";

        //When
        String result = HighestScoringWord.hight(someString);

        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEarliestWordWithTheSameNumberOfPoints(){
        //Given
        String someString = "asdf fdsa";
        String expected = "asdf";

        //When
        String result = HighestScoringWord.hight(someString);

        //Then
        assertThat(result).isEqualTo(expected);
    }
}