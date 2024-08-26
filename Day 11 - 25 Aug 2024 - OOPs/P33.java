import java.util.*;

class X {

public void m1() {
System.out.println("Class X's m1 Method Called!!");
}
public void m2() {
System.out.println("Class X's m2 Method Called!!");
}
}

class Y extends X {

public void m1() {
System.out.println("Class Y's m1 Method Called!!");
}
public void m3() {
System.out.println("Class Y's m3 Method Called!!");
}
}

class P33 {
public static void main(String[] args) {

System.out.println("-----------------------------------");

X ob1 = new X();
ob1.m1();
ob1.m2();

System.out.println("-----------------------------------");

Y ob2 = new Y();
ob2.m1();
ob2.m2();
ob2.m3();

System.out.println("-----------------------------------");


}
}