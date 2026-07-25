import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {

        // 1. Declare and Initialize Array
        int[] arr = {10, 20, 30, 40, 50};

        // 2. Print Array using Index
        System.out.println("1. Print Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 3. Print Array using For-Each Loop
        System.out.println("\n\n2. For-Each Loop");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // 4. Find Length
        System.out.println("\n\n3. Array Length = " + arr.length);

        // 5. Sum of Array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("4. Sum = " + sum);

        // 6. Average
        double average = (double) sum / arr.length;
        System.out.println("5. Average = " + average);

        // 7. Maximum Element
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("6. Maximum = " + max);

        // 8. Minimum Element
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        System.out.println("7. Minimum = " + min);

        // 9. Search Element
        int key = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        System.out.println("8. Search 30 = " + found);

        // 10. Reverse Array
        System.out.print("9. Reverse Array = ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // 11. Sort Array
        Arrays.sort(arr);

        System.out.print("\n10. Sorted Array = ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // 12. Copy Array
        int[] copy = Arrays.copyOf(arr, arr.length);

        System.out.print("\n11. Copied Array = ");
        for (int num : copy) {
            System.out.print(num + " ");
        }

        // 13. Two-Dimensional Array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        System.out.println("\n12. 2D Array");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
