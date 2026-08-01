public class Block {

    // Static Variable
    static int collegeCode = 101;

    // Instance Variable
    int studentId;

    // Static Block
    static {
        System.out.println("1. Static Block Executed");
        System.out.println("College Code = " + collegeCode);
    }

    // Instance Block
    {
        System.out.println("2. Instance Block Executed");
        studentId = 1001;
    }

    // Constructor
    BlockDemo() {
        System.out.println("3. Constructor Executed");
    }

    // Method
    void display() {
        System.out.println("Student ID = " + studentId);
    }

    public static void main(String[] args) {

        System.out.println("4. Main Method Started");

        // Object 1
        Block obj1 = new Block();
        obj1.display();

        System.out.println();

        // Object 2
        BlockDemo obj2 = new BlockDemo();
        obj2.display();
    }
}
