public class VariableNamingRules {
    public static void main(String[] args) {

        // 1. Starts with letter
        int age = 21;

        // 2. Starts with underscore
        int _count = 10;

        // 3. Starts with dollar sign
        int $salary = 25000;

        // 4. Digits at the end
        int student1 = 101;

        // 5. camelCase (Best Practice)
        String firstName = "Govind";

        // 6. Case Sensitive
        int marks = 80;
        int Marks = 90;
        int MARKS = 100;

        // Print values
        System.out.println("Age = " + age);
        System.out.println("_count = " + _count);
        System.out.println("$salary = " + $salary);
        System.out.println("student1 = " + student1);
        System.out.println("firstName = " + firstName);
        System.out.println("marks = " + marks);
        System.out.println("Marks = " + Marks);
        System.out.println("MARKS = " + MARKS);

        // ===========================
        // INVALID VARIABLE NAMES
        // (Uncomment karoge to compile error aayega)
        // ===========================

        // int 1age = 20;          // Starts with number ❌
        // int first name = 10;    // Space not allowed ❌
        // int class = 5;          // Keyword not allowed ❌
        // int age@ = 30;          // Special character not allowed ❌
        // int student-name = 40;  // Hyphen not allowed ❌
    }
}
