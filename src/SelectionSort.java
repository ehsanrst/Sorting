//Order of SelectionSort is O(n2)

/**
 * selection sort works as follows: you look through the entire array for the smallest element,
 * once you find it you swap it (the smallest element) with the first element of the array.
 * Then you look for the smallest element in the remaining array (an array without the first element)
 * and swap it with the second element. Then you look for the smallest element in the remaining array
 * and so on.
 */
public class SelectionSort {
    public static void main(String a[]) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = selectionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int min = arr[index];
            arr[index] = arr[i];
            arr[i] = min;
        }
        return arr;
    }


}
