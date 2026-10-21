import java.util.Random;

public class FindMedian {

    private static final Random rand = new Random();
    public static int findMedian(int[] arr) {
        int[] copy = arr.clone();
        int targetIndex = copy.length / 2;
        return quickSelect(copy, 0, copy.length - 1, targetIndex);
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }

        int pivotIndex = randomPartition(arr, left, right);

        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    private static int randomPartition(int[] arr, int left, int right) {
        int pivotIndex = left + rand.nextInt(right - left + 1);
        swap(arr, pivotIndex, right);
        return partition(arr, left, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}