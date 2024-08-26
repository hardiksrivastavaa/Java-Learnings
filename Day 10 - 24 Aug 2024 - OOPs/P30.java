// WAP to create a program to understand the concept of Hierarhical Inheritance

import java.util.*;

class Shape{
int s;
public void setValue(int side) {
s = side;
} }

class Square extends Shape {
public int area() {
return s*s;
} }

class Cube extends Shape {
public int volume() {
return s*s*s;
} }

class P30 {
public static void main(String[] args) {

int s, a, v;
Scanner sc = new Scanner(System.in);

Square sq = new Square();
System.out.print("Enter Side of Square : ");
s = sc.nextInt();
sq.setValue(s);
a = sq.area();
System.out.println("Area of Square : " + a);


Cube cu = new Cube();
System.out.print("Enter Side of Cube : ");
s = sc.nextInt();
cu.setValue(s);
v = cu.volume();
System.out.print("Volume of Cube : " + v);

}
}