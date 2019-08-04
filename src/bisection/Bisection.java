/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisection;
import java.util.Scanner;
/**
 *
 * @author Sabuj
 */
import java.lang.*;


    import java.util.*;
public class Bisection {

   
    public static void main(String args[]){
      double x = 0.0, bound1 = 0.0, bound2 = 2.0, decimal = 0.001, residual;
      while( bound2 - bound1 > decimal ){
         x = (bound1 + bound2) / 2.0;
         residual = Math.sin(x) - Math.cos(x);
         if ( residual > 0 )
            bound2 = x;
         else
            bound1 = x;
      }
      System.out.println( "the function F(x)= sin(x) - cos(x)" );
      System.out.println( "equals zero when x=" + x );
  }
}