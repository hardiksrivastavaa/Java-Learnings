// WAP to compare two strings for equality

import java.util.*;

class P20 {
    public static void main(String[] args) {

        String str1, str2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first string to compare : ");
        str1 = sc.nextLine();

        System.out.print("Enter your second string to compare : ");
        str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.print("Both strings are same.");
        } else {
            System.out.print("Both strings are not same.");
        }

    }
}