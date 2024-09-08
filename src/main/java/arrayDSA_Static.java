//Here’s an even shorter breakdown of array operations’ Big O:
//
//        Access: O(1)
//        Insert (end): O(1) amortized
//        Insert (start/middle): O(n)
//        Delete: O(n)
//        Search: O(n)
//        Sort: O(n log n)
//
//Advantages of Arrays:
//        Fast access: O(1) time to access elements by index.
//        Efficient memory: Stores elements in contiguous memory.
//        Simple structure: Easy to implement and use.
//        Disadvantages of Arrays:
//        Fixed size: Cannot resize after creation.
//        Costly insertions/deletions: O(n) time for shifts.
//        Limited functionality: Lacks dynamic behaviors like lists.
//        Use Cases:
//        Access-heavy applications: Where fast element access is needed.
//        Storing data of known, fixed size: Such as matrices, or buffers.
//        Iterating over data efficiently: In loops or with indexed operations.


import java.util.Arrays;

    public class arrayDSA_Static {

        // Static array declaration
        static int[] numbers = {5, 1, 8, 3, 2, 9};

        public static void main(String[] args) {
            // Initialize an array of integers
            int[] numbers = {5, 1, 8, 3, 2};

            // Print original array
            System.out.println("Original array: " + Arrays.toString(numbers));

            // Sort the array
            Arrays.sort(numbers);
            System.out.println("Sorted array: " + Arrays.toString(numbers));

            // Fill the array with a specific value
            Arrays.fill(numbers, 7);
            System.out.println("Array after fill: " + Arrays.toString(numbers));

            // Create another array for comparison
            int[] otherNumbers = {7, 7, 7, 7, 7};
            boolean areEqual = Arrays.equals(numbers, otherNumbers);
            System.out.println("Arrays are equal: " + areEqual);

            // Copy the array into a new array with a larger length
            int[] newArray = Arrays.copyOf(numbers, 10);
            System.out.println("Copied array with new length: " + Arrays.toString(newArray));

        }
    }
