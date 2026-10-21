import java.util.ArrayList;
import java.util.List;

public class QuicksortPartition {

    public static int[] partition(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int pivot = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int num : arr) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            } else {
                equal.add(num);
            }
        }

        int[] result = new int[arr.length];
        int index = 0;
        for (int num : left) result[index++] = num;
        for (int num : equal) result[index++] = num;
        for (int num : right) result[index++] = num;

        return result;
    }
}