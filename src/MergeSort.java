//Order of MergeSort is O(n log(n))

/**
 * Merge-sort is based on the divide-and-conquer paradigm. It involves the following three steps:
 * Divide the array into two (and so on) subArrays
 * Sort each subArray (Conquer)
 * Merge them into one (in a smart way!)
 */
public class MergeSort {
    private int[] array;
    private int[] tempMergeArr;
    private int length;

    public static void main(String a[]) {
        int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            //sort the left side of the array
            mergeSort(lowerIndex, middle);
            //sort the right side of the array
            mergeSort(middle + 1, higherIndex);
            //merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
