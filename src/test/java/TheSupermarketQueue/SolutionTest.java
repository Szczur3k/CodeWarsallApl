package TheSupermarketQueue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testNormalCondition() {
        assertEquals(9, Solution.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Solution.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Solution.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }

    @Test
    public void shouldReturnCorrectTime(){
        //given
        int[] customers = {7, 3, 4, 1, 3, 2, 3, 2, 7, 6, 5, 7, 4, 6, 4, 5, 5, 2, 1};
        int tilts = 5;

        //when
        int result = Solution.solveSuperMarketQueue(customers, tilts);
        int expected = 16;

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCorrectTime2(){
        //given
        int[] customers = {2, 2, 3, 3, 4, 4};
        int tilts = 2;

        //when
        int result = Solution.solveSuperMarketQueue(customers, tilts);
        int expected = 9;

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCorrectTime3(){
        //given
        int[] customers = {7, 3, 5, 6, 6, 7, 2, 7, 2, 3};
        int tilts = 6;

        //when
        int result = Solution.solveSuperMarketQueue(customers, tilts);
        int expected = 12;

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCorrectTime4(){
        //given
        int[] customers = {4,5,4,6,6,6,5,3,1,4,6,2,3,7,1,4,1,5,2,5,1,3,4};
        int tilts = 3;

        //when
        int result = Solution.solveSuperMarketQueue(customers, tilts);
        int expected = 30;

        //then
        assertThat(result).isEqualTo(expected);
    }
}



