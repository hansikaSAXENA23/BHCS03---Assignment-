/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author shreyasaxena
 */
import java.util.Scanner;
public class Complex
{
    int x,y;
    Complex(int x1, int y1)
    {
       x = x1; y = y1;
    }
    Complex add(Complex ob)
    {
       Complex temp = new Complex(0,0); 
       temp.x=ob.x+x;
       temp.y=ob.y+y;
       return temp;
    }
    Complex multiply(Complex ob)
    {
        Complex temp = new Complex(0,0); 
        temp.x=x*ob.x;
        temp.y=y*ob.y;
        return temp; 
    }
    
    public String toString()
    {
        return "x + iy = "+x+" + i"+y ; 
    }

    public static void main(String[] args)
   {
        int x1,y1;
        Scanner s = new Scanner(System.in); 
        Complex sum,mul; 
        System.out.println("Enter x: "); 
        x1 = s.nextInt(); 
        System.out.println("Enter y: "); 
        y1 = s.nextInt();
        Complex c1 = new Complex(x1,y1); 
        System.out.println("Enter no. to be added ");
        System.out.println("Enter x: "); 
        x1 = s.nextInt(); 
        System.out.println("Enter y: "); 
        y1 = s.nextInt();
        Complex c2 = new Complex(x1,y1); 
        sum=c1.add(c2); 
        System.out.println("Enter no. to be multiplied ");
        System.out.println("Enter x: "); 
        x1 = s.nextInt(); 
        System.out.println ("Enter y: "); 
        y1 = s.nextInt();
        Complex c3 = new Complex(x1,y1); 
        mul=c1.multiply(c3); 
        System.out.println("The sum is : "); 
        System.out.println(sum.toString()); 
        System.out.println("The product is : "); 
        System.out.println(mul.toString());
    }
}