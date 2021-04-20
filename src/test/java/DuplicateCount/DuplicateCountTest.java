package DuplicateCount;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateCountTest {

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, DuplicateCount.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, DuplicateCount.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, DuplicateCount.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, DuplicateCount.duplicateCount(test));
    }

    @Test
    public void shouldReturnsFive(){
        assertThat(DuplicateCount.duplicateCount("opwskkzlxxeqeqo")).isEqualTo(5);
    }


    @Test
    public void emptyReturnsZero() {
        assertEquals(0, DuplicateCount.duplicateCount(""));
    }

    @Test
    public void abcdeReturnsZeroTwo() {
        assertEquals(0, DuplicateCount.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaaReturnsOne() {
        assertEquals(1, DuplicateCount.duplicateCount("abcdeaa"));
    }

    @Test
    public void abcdeaBReturnsTwo() {
        assertEquals(2, DuplicateCount.duplicateCount("abcdeaB"));
    }

    @Test
    public void IndivisibilitiesReturnsTwo() {
        assertEquals(2, DuplicateCount.duplicateCount("Indivisibilities"));
    }

    @Test
    public void abcdefghijklmnopqrstuvwxyzReturnsZero() {
        assertEquals(0, DuplicateCount.duplicateCount("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void abcdefghijklmnopqrstuvwxyzaaAbReturnsTwo() {
        assertEquals(2, DuplicateCount.duplicateCount("abcdefghijklmnopqrstuvwxyzaaAb"));
    }

    @Test
    public void abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix() {
        assertEquals(26, DuplicateCount.duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix() {
        assertEquals(26, DuplicateCount.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}