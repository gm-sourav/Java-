
package javafirst;

import java.util.Scanner;

public class BioData {
    public static void main(String [] args) {
        
     Scanner input = new Scanner(System.in);
     
     String name;
     System.out.println("Enter your name - ");
     name = input.nextLine();
     
     
     int number;
     System.out.println("Enter any integer number :- ");
     number = input.nextInt();
     
     System.out.println("My namw is "+name);
     System.out.println("NUmber is "+number);
        
    }
    
}
