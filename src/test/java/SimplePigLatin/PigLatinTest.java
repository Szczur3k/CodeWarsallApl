package SimplePigLatin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }

    @Test
    public void FixedTestsWithPunctuations() {
        assertEquals("igPay atinlay siay oolcay !", PigLatin.pigIt("Pig latin is cool !"));
        assertEquals("hisTay siay , ymay tringsay ;", PigLatin.pigIt("This is , my string ;"));
    }

    @Test
    public void FixedTestsWithMap() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigItWithMap("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigItWithMap("This is my string"));
    }

    @Test
    public void FixedTestsWithPunctuationsWithMap() {
        assertEquals("igPay atinlay siay oolcay !", PigLatin.pigItWithMap("Pig latin is cool !"));
        assertEquals("hisTay siay , ymay tringsay ;", PigLatin.pigItWithMap("This is , my string ;"));
    }

}