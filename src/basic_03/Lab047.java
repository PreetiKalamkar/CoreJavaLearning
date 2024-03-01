package src.basic_03;

import java.util.Scanner;

public class Lab047 {
        public static void main(String[] args){

        // Take an input from the user ? Java
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number, I will tell if it is even/odd");
            int a = sc.nextInt();

            if(a%2 == 1){
                System.out.println("Odd number");
            }else {
                System.out.println("Even number");
            }

            }
        }


