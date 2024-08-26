class A {
public void showA() {
System.out.println("This message from class A");
}
}

class B extends A {
public void showB() {
System.out.println("This message from class B");
}
}

class C extends B {
public void showC() {
System.out.println("This message from class C");
}
}

class P31 {
public static void main(String[] args) {

A ob1 = new A();
ob1.showA();

System.out.println("-----------------------------------");

B ob2 = new B();
ob2.showA();
ob2.showB();

System.out.println("-----------------------------------");

C ob3 = new C();
ob3.showA();
ob3.showB();
ob3.showC();

}
}