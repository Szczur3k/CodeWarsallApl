package PickPeaks;

import java.util.*;

//CANT DO BEACUSE I DONT UNDERSTAND THE PROBLEM FOR FUCKING SAKE
public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        Map<String, List<Integer>> posAndPeaks = new HashMap<>();
        List<Integer> peaks = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        boolean wasPlateau = false;
        boolean isPlateau = false;
        if (arr.length - 1 > arr.length - 2 && arr.length - 1 == arr.length - 2) {
            isPlateau = checkIfItIsPlateau(arr, 2);
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] == arr[i - 2] &&
                    arr[i - 1] == arr[i - 3] &&
                    arr[i - 3] >= arr[i] &&
                    isPlateau &&
                    !wasPlateau) {
                peaks.add(arr[i - 3]);
                pos.add(i - 3);
                wasPlateau = true;
                continue;
            }
            if (arr[i] < arr[i - 1] && arr[i - 1] > arr[i - 2]) {
                peaks.add(arr[i - 1]);
                pos.add(i - 1);
            }
        }

        posAndPeaks.put("pos", pos);
        posAndPeaks.put("peaks", peaks);

        return posAndPeaks;
    }

    public static boolean checkIfItIsPlateau(int[] arrayToCheck, int i) {
        int countToPlateau = 0;
        if (arrayToCheck.length - 2 > arrayToCheck.length - 1) {
            return false;
        }

        for (int j = i; j < arrayToCheck.length; j++) {
            if (arrayToCheck[j] != arrayToCheck[j - 1]) {
                if (countToPlateau >= 3) {
                    return true;
                }
                countToPlateau = 0;
            }
            countToPlateau++;
        }
        return false;
    }
}


class Runner {
    public static void main(String[] args) {
        System.out.println(PickPeaks.getPeaks(new int[]{2, 1, 3, 1, 2, 2, 2, 2, 1}));
    }
}

/*
In this kata, you will write a function that returns the positions and the values of the "peaks"
(or local maxima) of a numeric array.
For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with a value of 5 (since arr[3] equals 5).
The output will be returned as a ``Map<String,List>with two key-value pairs:"pos"and"peaks".
If there is no peak in the given array,
simply return {"pos" => [], "peaks" => []}`.
Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos: [3, 7], peaks: [6, 3]}
(or equivalent in other languages)

All input arrays will be valid integer arrays (although it could still be empty),
so you won't need to validate the input.
The first and last elements of the array will not be considered as peaks (in the context of a mathematical function,
we don't know what is after and before and therefore, we don't know if it is a peak or not).
Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3] and [1, 2, 2, 2, 2] do not.
In case of a plateau-peak, please only return the position and value of the beginning of the plateau.
For example: pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]} (or equivalent in other languages)
Have fun!
 */