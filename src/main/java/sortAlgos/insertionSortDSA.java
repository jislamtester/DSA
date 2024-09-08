package sortAlgos;

public class insertionSortDSA {
// Insertion sort = after comparing elements to the left,
    //				shift elements to the right to make room to insert a value

    //				Quadratic time O(n^2)
    //				small data set = decent
    //				large data set = BAD

    //				Less steps than Bubble sort
    //				Best case is O(n) compared to Selection sort O(n^2)
    public static void main(String[] args) {

        int[] arr = {3, 2, 6, 2, 1, 8, 5};

        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    }




