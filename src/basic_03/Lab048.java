package src.basic_03;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {

        // Take three input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc = new Scanner(System.in); //OOPS
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("MAX is " + a);
        }else{
            System.out.println("Max is " + b);
        }
        // concatenation - combine two or more things


    }
}


