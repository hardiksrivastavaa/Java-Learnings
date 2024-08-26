// WAP to create a word counter

import java.util.*;

class P21 {
    public static void main(String[] args) {

        String str;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String to count the words : ");
        str = sc.nextLine();
        String[] words = str.split(" ");

        System.out.print("Here are the words counts : " + words.length);

    }
}