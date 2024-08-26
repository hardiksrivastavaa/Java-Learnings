//WAP to convert temperature from centigrade to fahrenhite

import java.util.*;

class P6 {
    public static void main(String[] args) {

        double c, f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Centigrade : ");
        c = sc.nextDouble();

        f = (9 * c) / 5 + 32;

        System.out.print("Temperature in Fahrenhite : " + f);

    }
}