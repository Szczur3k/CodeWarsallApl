package RecruitmentTasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KeyboardPhoneTest {

    @Test
    public void shouldReturnFromALAto25552(){

        //Given
        KeyboardPhone keyboard = new KeyboardPhone();
        String expected = "25552";

        //When
        String result = keyboard.changeWordToOldKeyboard("ALA");

        //Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFromGibonTo(){

        //Given
        KeyboardPhone keyboard = new KeyboardPhone();
        String expected = "44442266666";

        //When
        String result = keyboard.changeWordToOldKeyboard("Gibon");

        //Then
        assertThat(result).isEqualTo(expected);
    }

}