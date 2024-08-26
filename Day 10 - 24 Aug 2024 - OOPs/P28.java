// WAP to understand concept of constructor

class Student {
int rollno; // instance variable
String name;
double fee;

Student(int rollno, String name, double fee) {
this.rollno = rollno;
this.name = name;
this.fee = fee;
}
public void display() {
System.out.println("Roll No.: " + rollno);
System.out.println("Sudent Name: " + name);
System.out.println("Fee: " + fee);
}
}

class P28 {
public static void main(String[] args) {

Student s1 = new Student(1, "Hardik Srivastava", 4000);
s1.display();
Student s2 = new Student(2, "Sanskar Dubey", 6000);
s2.display();
}
}
