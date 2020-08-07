/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author hansikasaxena
 */

import java.util.*;
import p1.Shape;
public class Circle extends Shape 
{
    int r;
    public void input() 
    {
        Scanner S = new Scanner(System.in); 
        System.out.println("Enter radius of circle"); 
        r=S.nextInt();
    }
    public void area() 
    {
        double a;
        a=3.14*r*r;
        System.out.println("Area of circle = "+ a);
    } 
}