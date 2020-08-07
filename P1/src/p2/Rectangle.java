/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author hansikasaxena
 */

import java.util.*;
import p1.Shape;

public class Rectangle extends Shape 
{
    int l,b,a;
    public void input()
    {
     Scanner S = new Scanner(System.in); 
     System.out.println("Enter length and breadth of rectangle"); 
     l=S.nextInt();
     b=S.nextInt(); 
    }
    
    public void area() 
    {
        a=l*b;
        System.out.println("Area of rectangle = "+ a);
    }
}