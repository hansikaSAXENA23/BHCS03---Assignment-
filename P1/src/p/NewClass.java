/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

/**
 *
 * @author hansikasaxena
 */

import p1.twoDim;
import p2.threeDim;
public class NewClass 
{
    public static void main(String[] args) 
    {
     // TODO code application logic here 
     twoDim T2 = new twoDim(5,6);
     System.out.println(T2); 
     threeDim T3 = new threeDim(5);
     System.out.println(T3); 
     T2 =T3; 
     System.out.println(T2);

    } 
}
