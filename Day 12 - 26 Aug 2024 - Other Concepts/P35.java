/*  WAP to create a program to understand the concept of Exception Handling 
and Input through BufferedReader */

import java.io.*;

class P35 {
    public static void main(String[] args) throws IOException {

        int empid;
        String empname;
        double salary;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----------------------------");
        System.out.print("Enter Employee ID : ");
        empid = Integer.parseInt(br.readLine());

        System.out.print("Enter Employee Name : ");
        empname = br.readLine();

        System.out.print("Enter Employee Salary : ");
        salary = Double.parseDouble(br.readLine());
        System.out.println("----------------------------");

        System.out.println("Employee Name : " + empname);
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Salary : " + salary);
        System.out.println("----------------------------");

    }
}