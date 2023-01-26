// WAP to sum of  10 natural number Using all loop
package org.example;

public class Question_3 {
    public static void main(String[] args) {
        //for loop
        int forSum=0;
        for (int i=10;i>=1;i--){
            forSum+=i;
        }
        System.out.println("for loop sum :"+forSum);
        //while loop
        int whileSum=0;
        int i=10;
        while (i>=1){
            whileSum+=i;
            i--;
        }
        System.out.println("While loop sum :"+whileSum);
        //do While loop
        int doSum=0;
        i=10;
        do{
            doSum+=i;
            i--;
        }
        while (i>=1);
        System.out.println("do While loop sum :"+doSum);
    }
}
