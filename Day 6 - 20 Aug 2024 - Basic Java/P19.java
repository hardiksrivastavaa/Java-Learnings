// WAP to print the your name on user input with strings methods

import java.util.*;

class P19 {
public static void main(String[] args) {

String name;

Scanner sc = new Scanner(System.in);
System.out.print("Enter you name : ");
name = sc.nextLine();

System.out.println("Your name in uppercase : " + name.toUpperCase());
System.out.println("Your name in lowercase : " + name.toLowerCase());
System.out.println("Length of Your Name : " + name.length());

}
}