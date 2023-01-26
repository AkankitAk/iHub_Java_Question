// WAP to display 10 natural number in reverse order Using all loop
package org.example;

public class Question_2 {
    public static void main(String[] args) {
//for loop
        System.out.println("for Loop");
        for (int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
//while loop
        System.out.println("while Loop");
        int i=10;
        while (i>=1){
            System.out.print(i+" ");
            i--;
        }
//do While loop
        System.out.println("do while loop");
        i=10;
        do{
            System.out.print(i+" ");
            i--;
        }
        while (i>=1);
    }
}
