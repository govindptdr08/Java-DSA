import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String Input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        // Integer Input
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Float Input
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();

        // Double Input
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Character Input
        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        // Boolean Input
        System.out.print("Are you Passed (true/false): ");
        boolean passed = sc.nextBoolean();

        // Output
        System.out.println("\n----- Student Details -----");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Height  : " + height);
        System.out.println("Salary  : " + salary);
        System.out.println("Grade   : " + grade);
        System.out.println("Passed  : " + passed);

        sc.close();
    }
}
