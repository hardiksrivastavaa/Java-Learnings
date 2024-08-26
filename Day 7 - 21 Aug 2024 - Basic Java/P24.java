// WAP to find sum of numbers by using userdefined methods

import java.util.*;

class P24 {

static int sum(int a, int b) {
return (a+b);
}

public static void main(String[] args) {

int a,b,r;
Scanner sc = new Scanner(System.in);

System.out.print("Enter the value of a : ");
a = sc.nextInt();
System.out.print("Enter the value of b : ");
b = sc.nextInt();

r = sum(a, b);
System.out.print("Sum of a and b : " + r);

}
}