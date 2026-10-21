import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== TEST BÀI 1: QUICKSORT 1 - PARTITION ===");
        int[] arr1 = {4, 5, 3, 7, 2};
        System.out.println("Mảng ban đầu : " + Arrays.toString(arr1));

        int[] result1 = QuicksortPartition.partition(arr1);
        System.out.println("Sau Partition: " + Arrays.toString(result1));

        System.out.println("\n-----------------------------------\n");
        System.out.println("=== TEST BÀI 2: FIND THE MEDIAN ===");
        int[] arr2 = {0, 1, 2, 4, 6, 5, 3};
        System.out.println("Mảng ban đầu     : " + Arrays.toString(arr2));

        int median = FindMedian.findMedian(arr2);
        System.out.println("Phần tử trung vị : " + median);
    }
}