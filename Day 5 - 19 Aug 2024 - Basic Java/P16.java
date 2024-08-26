// WAP to store five numbers in an array and print numbers

import java.util.*;

class P16 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        int i, j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Numbers : ");

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Here is the array : ");
        for (i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}