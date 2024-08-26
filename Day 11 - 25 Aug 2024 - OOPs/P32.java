import java.util.*;

class Figure{

public int area(int s) {
return s*s;
}
public int area(int l, int b) {
return l*b;
}
}

class P32 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int s, l, b, a1, a2;

System.out.print("Enter the side of square : ");
s = sc.nextInt();

System.out.println("-----------------------------------");

Figure sq = new Figure();
a1 = sq.area(s);
System.out.println("Area of Square : " + a1);

System.out.println("-----------------------------------");

System.out.print("Enter the length of rectangle : ");
l = sc.nextInt();
System.out.print("Enter the breadth of rectangle : ");
b = sc.nextInt();

System.out.println("-----------------------------------");

Figure ra = new Figure();
a2 = ra.area(l, b);
System.out.println("Area of Rectangle : " + a2);

System.out.println("-----------------------------------");




}

}