package day3;
import java.util.Scanner;

public class DNF {
    public static boolean dnfSort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            } else {
                System.out.println("Invalid input detected. Array should contain only 0, 1, and 2.");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements (only 0, 1, 2): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (dnfSort(arr)) {
            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
