public class ClassObject {

    // Class
    static class Student {

        // Variables / Properties
        String name;
        int age;
        int marks;

        // Method
        void display() {
            System.out.println("Name  = " + name);
            System.out.println("Age   = " + age);
            System.out.println("Marks = " + marks);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Object 1
        Student s1 = new Student();

        s1.name = "Govind";
        s1.age = 21;
        s1.marks = 85;

        // Object 2
        Student s2 = new Student();

        s2.name = "Rahul";
        s2.age = 22;
        s2.marks = 90;

        // Calling method using objects
        s1.display();
        s2.display();
    }
}
