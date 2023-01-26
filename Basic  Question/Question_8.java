//WAP to check number is palindrome or not using all loop
package org.example;

import java.util.Scanner;

public class Question_8 {
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
        System.out.print("for loop reverse number :");
        if(reverse==num) System.out.println("palindrome number");
        else System.out.println("not palindrome number");

// while loop
        n=num;
        reverse=0;
        while(n>0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        System.out.print("while loop reverse number :");
        if(reverse==num) System.out.println("palindrome number");
        else System.out.println("not palindrome number");

// do while loop
        n=num;
        reverse=0;
        do{
            int rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        while (n>0);
        System.out.print("do while loop reverse :");
        if(reverse==num) System.out.println("palindrome number");
        else System.out.println("not palindrome number");

    }
}
