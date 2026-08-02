public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int a = 10;
            int b = 0;

            // Arithmetic Exception
            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception: " + e.getMessage());

        } finally {

            System.out.println("Finally Block Executed");
        }

        System.out.println();

        // Multiple Catch Example
        try {

            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Exception");

        } catch (Exception e) {

            System.out.println("General Exception");
        }

        System.out.println();

        // Manual Exception
        try {

            int age = 15;

            if (age < 18) {
                throw new Exception("Not Eligible for Voting");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        System.out.println("\nProgram Ended");
    }
}
