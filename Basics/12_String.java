import java.util.Scanner;
import java.util.Arrays;

public class AllString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. String Creation
        String s1 = "Hello";
        String s2 = new String("Java");

        System.out.println("1. Strings:");
        System.out.println(s1);
        System.out.println(s2);

        // 2. String Input
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();

        System.out.println("Name = " + name);

        // 3. String Length
        System.out.println("\n2. Length = " + name.length());

        // 4. Character Access
        if (name.length() > 0) {
            System.out.println("3. First Character = " + name.charAt(0));
            System.out.println("Last Character = "
                    + name.charAt(name.length() - 1));
        }

        // 5. Concatenation
        String firstName = "Govind";
        String lastName = "Patidar";

        String fullName = firstName + " " + lastName;

        System.out.println("\n4. Concatenation = " + fullName);

        // 6. concat() Method
        String a = "Hello ";
        String b = "World";

        System.out.println("5. concat() = " + a.concat(b));

        // 7. equals()
        String x = "Java";
        String y = "Java";

        System.out.println("\n6. equals() = " + x.equals(y));

        // 8. equalsIgnoreCase()
        String p = "JAVA";
        String q = "java";

        System.out.println("7. equalsIgnoreCase() = "
                + p.equalsIgnoreCase(q));

        // 9. == Operator
        System.out.println("8. == Comparison = " + (x == y));

        // 10. compareTo()
        System.out.println("9. compareTo() = " + x.compareTo(y));

        // 11. toUpperCase()
        System.out.println("\n10. Uppercase = " + name.toUpperCase());

        // 12. toLowerCase()
        System.out.println("11. Lowercase = " + name.toLowerCase());

        // 13. contains()
        System.out.println("12. Contains 'a' = " + name.contains("a"));

        // 14. startsWith()
        System.out.println("13. Starts With 'G' = " + name.startsWith("G"));

        // 15. endsWith()
        System.out.println("14. Ends With 'n' = " + name.endsWith("n"));

        // 16. indexOf()
        System.out.println("15. indexOf('a') = " + name.indexOf("a"));

        // 17. lastIndexOf()
        System.out.println("16. lastIndexOf('a') = " + name.lastIndexOf("a"));

        // 18. substring()
        String word = "Programming";

        System.out.println("\n17. substring(0, 4) = "
                + word.substring(0, 4));

        System.out.println("18. substring(4) = "
                + word.substring(4));

        // 19. replace()
        System.out.println("19. replace() = "
                + word.replace("Programming", "Java"));

        // 20. replace Character
        System.out.println("20. Replace Character = "
                + word.replace('m', 'x'));

        // 21. trim()
        String spaces = "   Hello Java   ";

        System.out.println("\n21. Before trim = [" + spaces + "]");
        System.out.println("After trim = [" + spaces.trim() + "]");

        // 22. isEmpty()
        String empty = "";

        System.out.println("22. isEmpty() = " + empty.isEmpty());

        // 23. split()
        String fruits = "Apple,Banana,Mango";

        String[] fruitArray = fruits.split(",");

        System.out.println("\n23. split():");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 24. String to Character Array
        char[] chars = word.toCharArray();

        System.out.println("\n24. toCharArray():");

        for (char ch : chars) {
            System.out.print(ch + " ");
        }

        // 25. StringBuilder
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("\n\n25. StringBuilder = " + sb);

        // append()
        sb.append(" Programming");
        System.out.println("26. append() = " + sb);

        // insert()
        sb.insert(5, "Language ");
        System.out.println("27. insert() = " + sb);

        // delete()
        sb.delete(5, 14);
        System.out.println("28. delete() = " + sb);

        // reverse()
        sb.reverse();
        System.out.println("29. reverse() = " + sb);

        // 30. StringBuilder Capacity
        System.out.println("30. Capacity = " + sb.capacity());

        sc.close();
    }
}
