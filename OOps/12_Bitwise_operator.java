public class BitwiseOperator {

    public static void main(String[] args) {

        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 1. Bitwise AND (&)
        System.out.println("\na & b = " + (a & b));

        // 2. Bitwise OR (|)
        System.out.println("a | b = " + (a | b));

        // 3. Bitwise XOR (^)
        System.out.println("a ^ b = " + (a ^ b));

        // 4. Bitwise NOT (~)
        System.out.println("~a = " + (~a));

        // 5. Left Shift (<<)
        System.out.println("a << 1 = " + (a << 1));

        // 6. Right Shift (>>)
        System.out.println("a >> 1 = " + (a >> 1));

        // 7. Unsigned Right Shift (>>>)
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}
