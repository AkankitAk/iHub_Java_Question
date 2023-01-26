// WAP to sum of all digit using all loop
package org.example;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
// for Loop
        int n=num,forSum=0;
        for(int i=0;n>0;i++){
            int rem=n%10;
            forSum+=rem;
            n/=10;
        }
        System.out.println("for loop sum of digit :"+forSum);
// while loop
        n=num;
        int whileSum=0;
        while(n>0){
            int rem=n%10;
            whileSum+=rem;
            n/=10;
        }
        System.out.println("while loop sum of digit :"+whileSum);
// do while loop
        n=num;
        int doSum=0;
        do{
            int rem=n%10;
            doSum+=rem;
            n/=10;
        }
        while (n>0);
        System.out.println("do while loop sum of all digit :"+doSum);
    }
}
