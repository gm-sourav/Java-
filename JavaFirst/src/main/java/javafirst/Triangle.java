
package javafirst;

import java.util.Scanner;

public class Triangle {
    public static void main(String[]arg){
        // triangle are;
        Scanner input = new Scanner(System.in);
        double a,b;
        
        System.out.println("Enter value of a :- ");
        a = input.nextFloat();
        
        System.out.println("Enter value of b :- ");
        b = input.nextFloat();
        
        double area =  (0.5 * a * b);
        System.out.println("Area of triange is "+area);
        
    }
    
}
