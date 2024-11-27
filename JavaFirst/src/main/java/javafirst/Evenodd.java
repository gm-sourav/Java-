
package javafirst;

import java.util.Scanner;


public class Evenodd {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter any integer :- ");
        n = input.nextInt();
        
        if(n % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
    
}
