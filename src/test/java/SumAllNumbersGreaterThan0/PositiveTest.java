package SumAllNumbersGreaterThan0;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositiveTest {

    @Test
    public void shouldReturnSumOfNumbers(){

        //Given
        int[] someNumbers = {1,5,3,10,2,3,1};

        //When
        int sum = Positive.sum(someNumbers);

        //Then
        assertThat(sum).isEqualTo(25);

    }

}