public class Math {
    public static void main(String[] args) {

        // 1. Constants
        System.out.println("1. PI = " + Math.PI);
        System.out.println("2. E = " + Math.E);

        // 2. Absolute Value
        System.out.println("\n3. abs(-10) = " + Math.abs(-10));

        // 3. Maximum
        System.out.println("4. max(10, 20) = " + Math.max(10, 20));

        // 4. Minimum
        System.out.println("5. min(10, 20) = " + Math.min(10, 20));

        // 5. Square Root
        System.out.println("6. sqrt(25) = " + Math.sqrt(25));

        // 6. Power
        System.out.println("7. pow(2, 3) = " + Math.pow(2, 3));

        // 7. Cube Root
        System.out.println("8. cbrt(27) = " + Math.cbrt(27));

        // 8. Round
        System.out.println("9. round(5.6) = " + Math.round(5.6));

        // 9. Floor
        System.out.println("10. floor(5.9) = " + Math.floor(5.9));

        // 10. Ceiling
        System.out.println("11. ceil(5.1) = " + Math.ceil(5.1));

        // 11. Random Number
        System.out.println("12. random() = " + Math.random());

        // Random number from 1 to 100
        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println("13. Random 1-100 = " + randomNumber);

        // 12. Trigonometric Functions
        double angle = 30;

        double radians = Math.toRadians(angle);

        System.out.println("\n14. sin(30) = " + Math.sin(radians));
        System.out.println("15. cos(30) = " + Math.cos(radians));
        System.out.println("16. tan(30) = " + Math.tan(radians));

        // 13. Convert Degree to Radian
        System.out.println("17. 180 Degree = "
                + Math.toRadians(180) + " Radian");

        // 14. Convert Radian to Degree
        System.out.println("18. PI Radian = "
                + Math.toDegrees(Math.PI) + " Degree");

        // 15. Logarithm
        System.out.println("\n19. log(10) = " + Math.log(10));

        // 16. Log Base 10
        System.out.println("20. log10(100) = " + Math.log10(100));

        // 17. Exponential
        System.out.println("21. exp(1) = " + Math.exp(1));

        // 18. Sign
        System.out.println("22. signum(-10) = " + Math.signum(-10));
    }
}
