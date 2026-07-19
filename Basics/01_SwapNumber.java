// swap two number without third variable
//input a=5, b=10
// output a=10, b=5
public class Basics {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Logic
        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("Swapping  a = " + a + ", b = " + b);
    }
}
