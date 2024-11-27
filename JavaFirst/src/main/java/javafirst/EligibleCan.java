
package javafirst;

import java.util.Scanner;


public class EligibleCan {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        char ans1,ans2;
        System.out.println("Have you complete your masters ? y/n");
        ans1 = input.next().charAt(0);
        System.out.println("Are you fluent in English ? y/n");
        ans2 = input.next().charAt(0);
        
        if((ans1 =='y'||ans1 == 'y') && (ans2 == 'y' || ans2 == 'y'))
        {
            System.out.println("You are eligible for the job interview ");
        }
        else{
            System.out.println("You are not eligible for the job interview ");
        }
    }
    
}
