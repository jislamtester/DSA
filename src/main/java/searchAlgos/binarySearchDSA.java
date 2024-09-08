package searchAlgos;

import java.lang.reflect.Array;
import java.util.Arrays;


// Binary Search :- searching algorithm that finds the target value withtin a sorted array.
//                  Half of the array is eliminated during each step
//                  using repeated halving, each time we divide into two parts to maintain smaller searching space
//                  Runtime Complexity : O(log n)

public class binarySearchDSA {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 13, 15, 18};
        int index = binarySearch(arr, 13);

        System.out.println(index); // Should print the index of 13, which is 4
    }

    public static int binarySearch(int[] arr, int value) {
        int firstInt = 0;
        int lastInt = arr.length - 1;

        while (firstInt <= lastInt) {
            int middleInt = (firstInt + lastInt) / 2;

            if (arr[middleInt] == value) {
                return middleInt;
            } else if (arr[middleInt] < value) {
                firstInt = middleInt + 1;
            } else {
                lastInt = middleInt - 1;
            }
        }
        return -1; // Value not found
    }
}
