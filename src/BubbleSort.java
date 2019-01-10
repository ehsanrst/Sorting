//Order of BubbleSort is O(n2)

/**
 * comparing each pair of adjacent items and swapping them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which indicates that
 * the list is sorted.
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        bubbleSort(input);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int k;
        for (int j = n; j >= 0; j--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swap(i, k, array);
                }
            }
            print(array);
        }
    }

    private static void swap(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
