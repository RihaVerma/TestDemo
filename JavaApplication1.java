/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Riha Verma
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1,s1=0,s2=0,s3=0,sum=0;
        for(i=1;i<=100;i=i+3)
        {
            s1=s1+i;
        }
        for(i=2;i<=100;i=i+3)
        {
            s2=s2+i;
        }
        for(i=3;i<=100;i=i+3)
        {
            s3=s3+i;
        }
        sum=s1+s2+s3;
        System.out.println("Sum is:" + sum);
        }
    }
