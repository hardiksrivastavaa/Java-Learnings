// WAP to print number upto a limit defined by user

import java.util.*;

class P12 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Limit : ");
        n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + "   ");
            i++;
        }
    }
}
