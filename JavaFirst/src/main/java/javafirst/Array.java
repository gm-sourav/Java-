
package javafirst;

import java.util.Scanner;


public class Array {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array - ");
        n = input.nextInt();
        int [] A = new int [n];
        
        System.out.println("Enter element of array :- ");
        for(int i = 0; i < n; i++)
        {
           if (input.hasNextInt())
           {
               A[i] = input.nextInt();
           }
        }
        System.out.println("Printing Array - ");
        for(int i = 0; i < n; i++){
            System.out.print(A[i]+"\t");
        }
            
    }
    
}
