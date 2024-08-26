class Employee {

int empid;
String empname;
double salary;

public void setValue(int eid, String ename, Double sal) {
empid = eid;
empname = ename;
salary= sal;
}

public void display() {
System.out.println("Employee ID : " + empid);
System.out.println("Employee Name : " + empname);
System.out.println("Employee Salary : " + salary);
}

}

class P27 {
public static void main(String[] args) {

Employee e1 =  new Employee();
e1.setValue(101, "Hardik", 50000.0);
e1.display();

Employee e2 =  new Employee();
e1.setValue(102, "Sanskar", 60000.0);
e1.display();

}
}
