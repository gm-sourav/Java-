
package javafirst;

import java.util.Scanner;


public class Voter {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int age;
        System.out.println("Enter your age :- ");
        age = input.nextInt();
        
        if(age >= 18)
        {
            System.out.println("Valid Votter ");
        }
        else{
            System.out.println("Invalid Votrter ");
        }
    }
    
}
