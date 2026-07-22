public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Assignment Operators
        int x = 10;
        x += 5;
        System.out.println("Assignment (+=): " + x);

        x -= 3;
        System.out.println("Assignment (-=): " + x);

        x *= 2;
        System.out.println("Assignment (*=): " + x);

        x /= 4;
        System.out.println("Assignment (/=): " + x);

        x %= 3;
        System.out.println("Assignment (%=): " + x);

        // 3. Relational Operators
        System.out.println("Relational Operators");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 4. Logical Operators
        boolean p = true;
        boolean q = false;

        System.out.println("Logical Operators");
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        // 5. Unary Operators
        int n = 5;

        System.out.println("Unary Operators");
        System.out.println("n = " + n);
        System.out.println("++n = " + (++n));
        System.out.println("--n = " + (--n));
        System.out.println("n++ = " + (n++));
        System.out.println("After n++ = " + n);
        System.out.println("n-- = " + (n--));
        System.out.println("After n-- = " + n);

        // 6. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator");
        System.out.println("Maximum = " + max);

        // 7. Bitwise Operators
        System.out.println("Bitwise Operators");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // 8. Shift Operators
        System.out.println("Shift Operators");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    
    }
}
