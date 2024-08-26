// WAP to find greatest number in two unequal numbers

import java.util.*;

class P9 {
    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater than b.");
            System.out.println("Value of a is : " + a);
            System.out.println("Value of b is : " + b);
        } else {
            System.out.println("b is greater than a.");
            System.out.println("Value of a is : " + a);
            System.out.println("Value of b is : " + b);
        }

    }
}