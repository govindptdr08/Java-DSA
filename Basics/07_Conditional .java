import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. Simple if
        if (num > 0) {
            System.out.println("1. Number is Positive");
        }

        // 2. if-else
        if (num % 2 == 0) {
            System.out.println("2. Number is Even");
        } else {
            System.out.println("2. Number is Odd");
        }

        // 3. if-else-if Ladder
        if (num > 0) {
            System.out.println("3. Positive Number");
        } else if (num < 0) {
            System.out.println("3. Negative Number");
        } else {
            System.out.println("3. Number is Zero");
        }

        // 4. Nested if
        if (num >= 0) {
            if (num <= 100) {
                System.out.println("4. Number is between 0 and 100");
            }
        }

        // 5. Logical Operators
        if (num >= 10 && num <= 50) {
            System.out.println("5. Number is between 10 and 50");
        }

        // 6. OR Operator
        if (num == 0 || num == 100) {
            System.out.println("6. Number is 0 or 100");
        }

        // 7. NOT Operator
        if (!(num < 0)) {
            System.out.println("7. Number is not Negative");
        }

        // 8. Ternary Operator
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("8. Ternary Result: " + result);

        // 9. Switch Statement
        System.out.print("Enter Day Number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("9. Monday");
                break;
            case 2:
                System.out.println("9. Tuesday");
                break;
            case 3:
                System.out.println("9. Wednesday");
                break;
            case 4:
                System.out.println("9. Thursday");
                break;
            case 5:
                System.out.println("9. Friday");
                break;
            case 6:
                System.out.println("9. Saturday");
                break;
            case 7:
                System.out.println("9. Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        sc.close();
    }
}
