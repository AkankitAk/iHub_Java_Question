// WAP to display 10 natural number Using all loop
package org.example;
public class Question_1 {
    public static void main(String[] args) {
//for loop
        System.out.println("For Loop");
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
//while loop
        System.out.println("While Loop");
        int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
//do While loop
        System.out.println("do While Loop");
        i=1;
        do{
            System.out.print(i+" ");
            i++;
        }
        while (i<=10);
    }
}
