/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author hansikasaxena
 */

import java.util.*; 
public class twoDim 
{
    private double x,y; public twoDim()
        {
         x=0;
         y=0;
        }
    public twoDim(double x1,double y1)
        {
         x=x1;
         y=y1;
        }
    public String toString() 
        {
         //overriding the toString() method
         return "The x and y co-ordnates are "+x+" , "+y ;
        } 
}