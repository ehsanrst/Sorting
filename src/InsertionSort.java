//Order of InsertionSort is O(n2)

/**
 * take an element from unsorted part and compare it with elements in sorted part,
 * moving form right to left
 * need 0 comparisons to insert the first element
 * need 1 comparison to insert the second element
 * need 2 comparisons to insert the third element
 * ...
 * we need (N-1) comparisons (at most) to insert the last element
 * Totally
 * 1 + 2 + 3 + ... + (N-1) = O(n2)
 */
public class InsertionSort {
    public static void main(String a[]) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = insertionSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] insertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }
}
