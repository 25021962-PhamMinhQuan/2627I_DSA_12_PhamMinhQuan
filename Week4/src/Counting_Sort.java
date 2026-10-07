import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;

class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));

        for (int num : arr) {
            result.set(num, result.get(num) + 1);
        }

        return result;
    }

}

public class Counting_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] counts = new int[100];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            counts[num]++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(counts[i] + " ");
        }
        scanner.close();
    }
}