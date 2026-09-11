import java.util.Scanner;

public class RecursiveBubbleSort {

    static void bubbleSort(int[] arr, int n) {

        // Base case
        if (n == 1) {
            return;
        }

        // One complete pass
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Sort remaining elements
        bubbleSort(arr, n - 1);
    }

    static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);

        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();
    }
}
