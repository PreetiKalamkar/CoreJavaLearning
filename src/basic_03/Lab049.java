package src.basic_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {

        // Take three input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a, b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Greater value is " + a);
        }else{
            System.out.println("Greater value is " + b);
        }
    }
}


