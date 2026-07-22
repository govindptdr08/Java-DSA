public class VariableDemo {
    public static void main(String[] args) {
public class VariablesDemo {
    public static void main(String[] args) {

        // Variables
        String name = "Govind";
        int age = 21;
        int a = 10;
        int b = 20;
        double salary = 25000.50;
        char grade = 'A';
        boolean pass = true;

        // Print Variables
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
        System.out.println("Grade = " + grade);
        System.out.println("Pass = " + pass);

        // Addition
        System.out.println("Addition = " + (a + b));

        // Subtraction
        System.out.println("Subtraction = " + (b - a));

        // Multiplication
        System.out.println("Multiplication = " + (a * b));

        // Division
        System.out.println("Division = " + (b / a));

        // Average
        double average = (a + b) / 2.0;
        System.out.println("Average = " + average);

        // Rectangle Area
        int length = 10;
        int width = 5;
        int area = length * width;
        System.out.println("Rectangle Area = " + area);

        // Simple Interest
        double p = 1000;
        double r = 5;
        double t = 2;
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);

        // Celsius to Fahrenheit
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);

        // Swap Two Numbers
        int x = 5;
        int y = 10;
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
    }
}
