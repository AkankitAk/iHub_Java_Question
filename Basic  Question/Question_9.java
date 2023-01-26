package org.example;

import java.util.Scanner;

//WAP to check the number is Armstrong or not using all loop
public class Question_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
// for loop
        int n=num,aram=0;
        for(int i=0;n>0;i++){
            int rem=n%10;
            aram+=rem*rem*rem;
            n/=10;
        }
        if(aram==num) System.out.print("for loop : Aramstrong number ");
        else System.out.print("for loop : Not Aramstrong number ");
// while loop
        n=num;
        aram=0;
        while(n>0){
            int rem=n%10;
            aram+=rem*rem*rem;
            n/=10;
        }
        System.out.println();
        if(aram==num) System.out.print("While loop : Aramstrong number ");
        else System.out.print("while loop : Not Aramstrong number ");
// do while loop
        n=num;
        aram=0;
        do{
            int rem=n%10;
            aram+=rem*rem*rem;
            n/=10;
        }
        while (n>0);
        System.out.println();
        if(aram==num) System.out.print("do while loop : Aramstrong number ");
        else System.out.print("do while loop : Not Aramstrong number ");
    }
}
