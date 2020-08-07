/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

/**
 *
 * @author  hansikasaxena
 */

import java.util.*; 
import p2.Rectangle; 
import p1.Shape;
import p3.Circle; 
        
public class Main 
{
    public static void main(String args[]) 
    {
        int c;
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Area of Rectangle \n 2- Area of Circle \n Enter your choice");
        c=s.nextInt();
        Shape S;
        switch(c)
        {
            case 1: Rectangle S1=new Rectangle();
                    S1.input();
                    S=S1;
                    S.area();
                    break;
            case 2: Circle S2=new Circle(); 
                    S2.input();
                    S=S2; 
                    S.area(); 
                    break;
        }
    }
}
