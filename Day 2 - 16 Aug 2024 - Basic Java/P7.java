// WAP to convert temperature from fahrenhite to centigrade 

import java.util.*;

class P7 {
    public static void main(String[] args) {

        double c, f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temerature in Fahrenhite : ");
        f = sc.nextDouble();

        c = (f - 32) * 5 / 9;

        System.out.print("Temprature in Centigarde : " + c);

    }
}
