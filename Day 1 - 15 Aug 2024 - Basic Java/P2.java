//WAP to find volume of cuboid with user input of l,b and h

import java.util.*;

class P2 {
    public static void main(String[] args) {
        int l, b, h, v;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length : ");
        l = sc.nextInt();

        System.out.print("Enter breadth : ");
        b = sc.nextInt();

        System.out.print("Enter height : ");
        h = sc.nextInt();

        v = l * b * h;

        System.out.print("Volume of Cuboid is : " + v);

    }
}