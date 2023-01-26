// WAP to find the factorial of given number Using all loop
package org.example;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
// forLoop
        System.out.println("for loop");
        for(int i=1;i<=num/2;i++){
            if(num%i==0) System.out.print(i+" ");
        }
        System.out.println();
// while loop
        System.out.println("while loop");
        int i=1;
        while (i<=num/2){
            if(num%i==0) System.out.print(i+" ");
            i++;
        }
        System.out.println();
//do While loop
        System.out.println("do while loop");
        i=1;
        do{
            if(num%i==0) System.out.print(i+" ");
            i++;
        }
        while (i<=num/2);
    }
}
