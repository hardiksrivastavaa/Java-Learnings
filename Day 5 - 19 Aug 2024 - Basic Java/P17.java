// WAP to find sum and average of 10 numbers using array

import java.util.*;

class P17 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int i, sum = 0;
        double avg;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers : ");

        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        avg = (float) sum / 10;

        System.out.print("Sum of 10 Numbers is " + sum + " and average is " + avg);

    }
}