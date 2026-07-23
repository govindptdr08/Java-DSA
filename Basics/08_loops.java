public class Loops {
    public static void main(String[] args) {

        // 1. For Loop
        System.out.println("1. For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. While Loop
        System.out.println("\n2. While Loop");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3. Do-While Loop
        System.out.println("\n3. Do-While Loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // 4. Nested Loop
        System.out.println("\n4. Nested Loop");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 5. Enhanced For Loop (For-Each)
        System.out.println("\n5. Enhanced For Loop");
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }

        // 6. Break Statement
        System.out.println("\n6. Break Statement");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        // 7. Continue Statement
        System.out.println("\n7. Continue Statement");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
