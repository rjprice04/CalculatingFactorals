/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculating.factorials;

import java.util.Scanner;

/**
 *
 * @author ryanprice
 */
public class CalculatingFactorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       System.out.println("What number do you want to use?");
       Scanner reader = new Scanner(System.in);
       double number = reader.nextInt();
       
       double numberfact= fact(number);
       System.out.format(number+"! found recursively is "+ numberfact +"\n" );
       double numCopy = number;
       double newFact=1;
       while(numCopy != 0){
           newFact = newFact * numCopy;
           numCopy--;
       }
       System.out.format(number+"! found iteratively is "+newFact+"\n");
        
        
    }
    static double fact(double num){
        if( num == 1 || num ==0 ){
            return 1.0;
        }
        else{
            return fact(num-1)*num;
        }
    }
    
}
