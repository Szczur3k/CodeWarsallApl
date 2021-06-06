package PickPeaks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class PickPeaksTest {

    private static String[] msg = {"should support finding peaks",
            "should support finding peaks, but should ignore peaks on the edge of the array",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks, but should ignore peaks on the edge of the array"};

    private static int[][] array = {{1, 2, 3, 6, 4, 1, 2, 3, 2, 1},
            {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3},
            {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1},
            {2, 1, 3, 1, 2, 2, 2, 2, 1},
            {2, 1, 3, 1, 2, 2, 2, 2}};

    private static int[][] posS = {{3, 7},
            {3, 7},
            {3, 7, 10},
            {2, 4},
            {2},};

    private static int[][] peaksS = {{6, 3},
            {6, 3},
            {6, 3, 2},
            {3, 2},
            {3}};

    @Test
    public void sampleTests() {
        for (int n = 0; n < msg.length; n++) {
            final int[] p1 = posS[n], p2 = peaksS[n];
            Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {{
                put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
                put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
            }},
                    actual = PickPeaks.getPeaks(array[n]);
            Assertions.assertEquals(expected, actual, msg[n]);
        }
    }

    @Test
    public void shouldReturnCorrectPosAndPeaks() {
        //Given
        int[] somePeaks = {1, 2, 3, 6, 4, 1, 2, 3, 2, 1};

        //When
        Map<String, List<Integer>> result = PickPeaks.getPeaks(somePeaks);
        Map<String, List<Integer>> shouldReturn = new HashMap<>();
        shouldReturn.put("pos", Arrays.asList(3, 7));
        shouldReturn.put("peaks", Arrays.asList(6, 3));

        //Then
        assertThat(result).isEqualTo(shouldReturn);
    }

    @Test
    public void shouldReturnCorrectPosAndPeaks2() {
        //Given
        int[] somePeaks = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3};

        //When
        Map<String, List<Integer>> result = PickPeaks.getPeaks(somePeaks);
        Map<String, List<Integer>> shouldReturn = new HashMap<>();
        shouldReturn.put("pos", Arrays.asList(3, 7));
        shouldReturn.put("peaks", Arrays.asList(6, 3));

        //Then
        assertThat(result).isEqualTo(shouldReturn);
    }

    @Test
    public void shouldReturnCorrectPosAndPeaks3() {
        //Given
        int[] somePeaks = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1};

        //When
        Map<String, List<Integer>> result = PickPeaks.getPeaks(somePeaks);
        Map<String, List<Integer>> shouldReturn = new HashMap<>();
        shouldReturn.put("pos", Arrays.asList(3, 7, 10));
        shouldReturn.put("peaks", Arrays.asList(6, 3, 2));

        //Then
        assertThat(result).isEqualTo(shouldReturn);
    }

    @Test
    public void shouldReturnCorrectPosAndPeaks4() {
        //Given
        int[] somePeaks = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1};

        //When
        Map<String, List<Integer>> result = PickPeaks.getPeaks(somePeaks);
        Map<String, List<Integer>> shouldReturn = new HashMap<>();
        shouldReturn.put("pos", Arrays.asList(3, 7, 10));
        shouldReturn.put("peaks", Arrays.asList(6, 3, 2));

        //Then
        assertThat(result).isEqualTo(shouldReturn);
    }

    @Test
    public void shouldReturnCorrectPosAndPeaksWithPlateauOnEdge() {
        //Given
        int[] somePeaks = {2, 1, 3, 1, 2, 2, 2, 2};

        //When
        Map<String, List<Integer>> result = PickPeaks.getPeaks(somePeaks);
        Map<String, List<Integer>> shouldReturn = new HashMap<>();
        shouldReturn.put("pos", Arrays.asList(2,4));
        shouldReturn.put("peaks", Arrays.asList(3,2));

        //Then
        assertThat(result).isEqualTo(shouldReturn);
    }

    @Test
    public void shouldReturnCorrectPosAndPeaksWithPlateau() {
        //Given
        int[] somePeaks = {2, 1, 3, 1, 2, 2, 2, 2, 1};

        //When
        Map<String, List<Integer>> result = PickPeaks.getPeaks(somePeaks);
        Map<String, List<Integer>> shouldReturn = new HashMap<>();
        shouldReturn.put("pos", Arrays.asList(2,4));
        shouldReturn.put("peaks", Arrays.asList(3,2));

        //Then
        assertThat(result).isEqualTo(shouldReturn);
    }




}