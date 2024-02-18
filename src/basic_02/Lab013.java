package src.basic_02;

import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args) {
        double a = 34;
        double b = 10;
        double result = a % b;
        //  % -> mod -> reminder
        System.out.println(result);

        // 10 | 34 | 3  -Q
        //    | 30 |
        //   ---------
        //     4

        // 78 % 12 ->
        /* 12 | 78 | 6 - Q
              | 72 |
              --------
              6
         */

        int num = 38;
        int r = num%2;
        System.out.println(r);

        // num%2 == 0 -> even
        // num%2 == 1 -> odd

        System.out.println("Please enter the input and i will tell if it is even or odd");

        // Program code for even odd calculator

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int Result = input%2;
        if ( Result== 0){
            System.out.println("It's a even no.");
        }else {
            System.out.println("It's odd");
        }

    }

}