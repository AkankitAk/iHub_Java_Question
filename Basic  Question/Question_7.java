//WAP to display reverse of a number
package org.example;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
// for loop
        int n=num,reverse=0;
        for(int i=0;n>0;i++){
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        System.out.println("for loop reverse number : "+reverse);
// while loop
        n=num;
        reverse=0;
        while(n>0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        System.out.println("while loop reverse number :"+reverse);
// do while loop
        n=num;
        reverse=0;
        do{
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        while (n>0);
        System.out.println("do while loop reverse :"+reverse);
    }
}
