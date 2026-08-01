public class FinalKeyword {

    // ============================
    // Final Variable
    // ============================
    final int MAX_MARKS = 100;

    // ============================
    // Final Method
    // ============================
    static class Person {

        final void show() {
            System.out.println("Final Method");
        }
    }

    // Child Class
    static class Student extends Person {

        // ❌ Cannot Override Final Method
        /*
        void show() {
            System.out.println("Hello");
        }
        */

        void display() {
            System.out.println("Display Method");
        }
    }

    // ============================
    // Final Class
    // ============================
    final static class College {

        void collegeName() {
            System.out.println("ABC Engineering College");
        }
    }

    public static void main(String[] args) {

        FinalKeyword obj = new FinalKeyword();

        // Final Variable
        System.out.println("Maximum Marks = " + obj.MAX_MARKS);

        // obj.MAX_MARKS = 200;   // ❌ Error

        // Final Method
        Student s = new Student();
        s.show();
        s.display();

        // Final Class
        College c = new College();
        c.collegeName();

        // ❌ Cannot Extend Final Class
        /*
        class Test extends College {
        }
        */
    }
}
