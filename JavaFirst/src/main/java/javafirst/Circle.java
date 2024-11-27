
package javafirst;

import java.util.Scanner;


public class Circle {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        
        double pi = 3.1416,r,area;
        
        System.out.println("Enter value of r - ");
        r = input.nextDouble();
        
        area = pi * r * r;
        
        System.out.println("Area of circle is "+area);
        
    }
    
}
