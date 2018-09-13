
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josephine Ofobrukweta
 */
public class SimpleCalculator {
  public static void main(String[] args)
      {
          int a;
          int b;
          Scanner input = new Scanner (System.in);
         System.out.print("To add two numbers press 1\n");
         System.out.print("To multiple two numbers press any other number\n");
         System.out.print("Enter your choice: ");
         int option = input.nextInt();
         
         System.out.print("Enter the first number: ");
           a = input.nextInt();
           System.out.print("Enter the second number: ");
          b = input.nextInt();
          if(option == 1)
          {
            int c = a + b;
            System.out.print("The Sum of the two numbers is "+ c +"\n");
          }
          else {
              int c = a * b;
            System.out.print("The Product of the two numbers is "+ c +"\n");
          }   
          System.out.println("Program Ends");
      }    
}
