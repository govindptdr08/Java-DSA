public class InheritanceDemo {

    // =========================
    // 1. Single Inheritance
    // =========================

    static class Animal {
        void eat() {
            System.out.println("Animal eats");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }


    // =========================
    // 2. Multilevel Inheritance
    // =========================

    static class GrandParent {
        void property() {
            System.out.println("GrandParent Property");
        }
    }

    static class Parent extends GrandParent {
        void house() {
            System.out.println("Parent House");
        }
    }

    static class Child extends Parent {
        void bike() {
            System.out.println("Child Bike");
        }
    }


    // =========================
    // 3. Hierarchical Inheritance
    // =========================

    static class Person {
        void walk() {
            System.out.println("Person can walk");
        }
    }

    static class Student extends Person {
        void study() {
            System.out.println("Student studies");
        }
    }

    static class Teacher extends Person {
        void teach() {
            System.out.println("Teacher teaches");
        }
    }


    // =========================
    // Main Method
    // =========================

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("---- Single Inheritance ----");

        Dog d = new Dog();

        d.eat();   // Parent method
        d.bark();  // Child method


        // Multilevel Inheritance
        System.out.println("\n---- Multilevel Inheritance ----");

        Child c = new Child();

        c.property();  // GrandParent method
        c.house();     // Parent method
        c.bike();      // Child method


        // Hierarchical Inheritance
        System.out.println("\n---- Hierarchical Inheritance ----");

        Student s = new Student();
        Teacher t = new Teacher();

        s.walk();      // Person method
        s.study();     // Student method

        t.walk();      // Person method
        t.teach();     // Teacher method
    }
}
