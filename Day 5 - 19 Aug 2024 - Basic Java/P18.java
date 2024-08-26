// WAP to store five numbers in list and display numbers in sorted order

import java.util.*;

class P18 {
    public static void main(String[] args) {

        int arr[] = new int[5];

        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Numbers : ");

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Here is the sorted array : ");

        for (i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}