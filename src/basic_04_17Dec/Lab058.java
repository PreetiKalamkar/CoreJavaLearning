package src.basic_04_17Dec;

import java.util.Scanner;

public class Lab058 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, i will tell you if it is vowel");

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("It's a vowel");
                break;
            case 'e':
                System.out.println("It's a vowel");
                break;
            case 'i':
                System.out.println("It's a vowel");
                break;
            case 'o':
                System.out.println("It's a vowel");
                break;
            case 'u':
                System.out.println("It's a vowel");
                break;
            default:
                System.out.println("not a vowel");
        }
    }
}



