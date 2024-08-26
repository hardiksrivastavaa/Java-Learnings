// WAP to check given string is palindrome or not

import java.util.*;

class P23 {
public static void main(String[] args) {
String str, reversed = "";

Scanner sc = new Scanner(System.in);
System.out.print("Enter your sentence : ");
str = sc.nextLine();

for (int i = str.length() - 1; i >= 0; --i) {
reversed += str.charAt(i);
}

if(reversed.equalsIgnoreCase(str)) {
System.out.print("Enter String is Palindrome.");
} else {
System.out.print("Enter String is not a Palindrome.");
}

}
}