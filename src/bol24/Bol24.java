
package bol24;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol24 {

   
    public static void main(String[] args) {
        float num1,num2,suma,resta,producto,division;
        Scanner obx= new Scanner(System.in);
        System.out.println("Inserte el valor del primer numero");
        num1=obx.nextFloat();
        System.out.println("Inserte el valor del segundo numero:");
        num2=obx.nextFloat();
        
        suma=num1+num2;
        System.out.println("suma"+suma);
        resta=num1-num2;
        System.out.println("resta"+resta);
        producto=num1*num2;
        System.out.println("producto"+producto);
        division=num1/num2;
        System.out.println("division"+division);
        
        
        
    }
    
}
