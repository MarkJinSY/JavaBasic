package RegularExpression;

import java.util.Scanner;

public class RegularExpression {
    public static String getString() {
        String str;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a String: ");
        str = ip.nextLine();
        System.out.println("The input String is " + str);
        ip.close(); // necessary to avoid memory leaks
        return str;
    }

    public static void main(String[] args) {
        getString();
    }
}
