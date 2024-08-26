// WAP to find area of rectangle using method

import java.util.*;

class P25 {
public static void main(String[] args) {

int x, y, a;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the length of Rectangle : ");
x = sc.nextInt();

System.out.print("Enter the breadth of Rectangle : ");
y = sc.nextInt();

P25 p = new P25();
a = p.area(x, y);

System.out.print("Here is the area of Rectangle : " + a);

}

public int area(int l, int b) {
return (l*b);
}
}