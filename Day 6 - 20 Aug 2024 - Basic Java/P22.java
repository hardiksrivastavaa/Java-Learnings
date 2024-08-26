// WAP to replace a word in string using replace method

import java.util.*;

class P22 {
    public static void main(String[] args) {

        String str, fw, rw;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence : ");
        str = sc.nextLine();

        System.out.print("Find What ? ");
        fw = sc.nextLine();

        System.out.print("Replace What ? ");
        rw = sc.nextLine();

        System.out.print("Here is the modified sentence : " + str.replace(fw, rw));

    }
}