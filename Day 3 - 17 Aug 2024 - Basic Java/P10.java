// WAP to find the greatest Number in three unequal Numbers

import java.util.*;

class P10 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print(a + "(a) is the greatest number");
        }
        if (b > a && b > c) {
            System.out.print(b + "(b) is the greatest number");
        } else {
            System.out.print(c + "(c) is the greatest number");
        }
    }
}
