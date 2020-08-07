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
import p1.twoDim;
public class threeDim extends twoDim 
{
    private double z; 
    public threeDim()
    {
     z=0;
    }
    public threeDim(double z1) 
    {
     z=z1;
    }
    public String toString() 
    {
     //overriding the toString() method
     return "The z co-rdnate is "+z+" , " ; 
    }
}