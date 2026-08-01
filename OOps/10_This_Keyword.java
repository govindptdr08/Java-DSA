public class ThisKeyword {

    String name;
    int age;

    // Constructor 1
    ThisKeywordDemo() {
        this("Govind", 21); // Calls Constructor 2
        System.out.println("Default Constructor");
    }

    // Constructor 2
    ThisKeywordDemo(String name, int age) {

        // this refers to current object variables
        this.name = name;
        this.age = age;
    }

    // Method
    void display() {
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);

        // Calling current class method
        this.show();
    }

    void show() {
        System.out.println("Show Method Called");
    }

    // Passing current object
    void passObject(ThisKeywordDemo obj) {
        System.out.println("Object Passed Successfully");
    }

    void sendObject() {
        passObject(this);
    }

    // Returning current object
    ThisKeywordDemo getObject() {
        return this;
    }

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword();

        obj.display();

        obj.sendObject();

        ThisKeywordDemo obj2 = obj.getObject();

        System.out.println("Returned Object Name = " + obj2.name);
    }
}
