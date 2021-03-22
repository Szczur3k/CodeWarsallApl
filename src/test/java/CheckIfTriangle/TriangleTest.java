package CheckIfTriangle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void shouldReturnTrueIsTriangle() {

        //When
        boolean isTriangle = Triangle.isTriangle(2, 2, 3);

        //Then
        assertThat(isTriangle).isTrue();


    }


    @Test
    public void shouldReturnFalseIsNotTriangle() {

        //When
        boolean isTriangle = Triangle.isTriangle(5,2,2);

        //Then
        assertThat(isTriangle).isFalse();
    }

}