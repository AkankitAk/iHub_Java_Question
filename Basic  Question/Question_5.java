// WAP to display Multiplication of given table using all loop
package org.example;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
// for loop
        System.out.println(" for loop ");
        for (int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
// while Loop
        System.out.println(" while Loop ");
        int i=1;
        while (i<=10){
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }
// do while loop
        System.out.println(" do while loop");
        i=1;
        do{
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }
        while (i<=10);
    }
}
