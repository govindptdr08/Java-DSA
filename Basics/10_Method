public class Methods {

    // 1. No Parameter, No Return Type
    static void greet() {
        System.out.println("Hello, Welcome to Java!");
    }

    // 2. Parameter, No Return Type
    static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // 3. No Parameter, Return Type
    static int getNumber() {
        return 100;
    }

    // 4. Parameter, Return Type
    static int multiply(int a, int b) {
        return a * b;
    }

    // 5. Method Overloading
    static void display() {
        System.out.println("Display Method");
    }

    static void display(String name) {
        System.out.println("Name = " + name);
    }

    // 6. Instance Method (Non-Static)
    void showMessage() {
        System.out.println("This is an Instance Method");
    }

    public static void main(String[] args) {

        // 1. No Parameter, No Return
        greet();

        // 2. Parameter, No Return
        add(10, 20);

        // 3. No Parameter, Return
        int number = getNumber();
        System.out.println("Returned Number = " + number);

        // 4. Parameter, Return
        int result = multiply(5, 4);
        System.out.println("Multiplication = " + result);

        // 5. Method Overloading
        display();
        display("Govind");

        // 6. Instance Method
        MethodsDemo obj = new MethodsDemo();
        obj.showMessage();

        // 7. Built-in Methods
        String text = "java programming";

        System.out.println("Length = " + text.length());
        System.out.println("Uppercase = " + text.toUpperCase());
        System.out.println("Lowercase = " + text.toLowerCase());
        System.out.println("Character = " + text.charAt(0));
    }
}
