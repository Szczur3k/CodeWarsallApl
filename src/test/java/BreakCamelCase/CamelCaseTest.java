package BreakCamelCase;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CamelCaseTest {

    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", CamelCase.breakCamelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", CamelCase.breakCamelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", CamelCase.breakCamelCase("camelcasingtest"));
    }

    @Test
    public void shouldReturnBreakSentence(){

        //Given
        String sentence = "CamelCasing";

        //When
        String result = CamelCase.breakCamelCase(sentence);

        //When
        assertThat(result).isEqualTo("Camel Casing");

    }

}