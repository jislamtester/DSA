package sortAlgos;
//---------------------------------------------------------------------------------------------
// Selection Sort :- search through an array and keep track of minimum value in each iteration, 
//                   and after every iteration we swap values

//                   Quadratic time O(n^2)
//                   small dataset = okay
//                   large dataset = bad
//----------------------------------------------------------------------------------------------

public class selectionSortDSA {
    // selection sort = search through an array and keep track of the minimum value during
    //     each iteration. At the end of each iteration, we swap variables.

    //     Quadratic time O(n^2)
    //     small data set = okay
    //     large data set = BAD
    public static void main(String[] args) {
        int[] arr = {3,2,6,1,9,4,2,5,7};

        selectionSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap only if a new minimum was found
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }


}
