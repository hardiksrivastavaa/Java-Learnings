// WAP to create a program to understand the concept of Exception Handling

import java.util.*;

class P34 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("----------------------------");
            System.out.print("Enter the first Number : ");
            x = sc.nextInt();

            System.out.print("Enter the Second Number : ");
            y = sc.nextInt();
            System.out.println("----------------------------");

            z = x / y;

            System.out.println("the Division is : " + z);
            System.out.println("----------------------------");
        }

        catch (ArithmeticException ex1) {
            System.out.println("Are you trying to / by zero?");
            System.out.println("the error is : " + ex1);
            System.out.println("----------------------------");

        } catch (InputMismatchException ex2) {
            System.out.println("Enter Numbers only.");
            System.out.println("the error is : " + ex2);
            System.out.println("----------------------------");
        }

        finally {
            System.out.println("This is finally Block");
            System.out.println("----------------------------");
        }
    }
}