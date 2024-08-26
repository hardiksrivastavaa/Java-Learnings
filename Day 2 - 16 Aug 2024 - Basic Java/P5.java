// WAP to take user name as input and print a mesage with his name

import java.util.Scanner;
                
   class P5 {
       public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter your name: ");

           String naam = scanner.nextLine(); 

	   System.out.println("Hello, " + naam + "!");                   

	}
      }