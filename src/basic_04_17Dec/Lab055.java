package src.basic_04_17Dec;

import java.util.Scanner;

public class Lab055 {

    public static void main(String[] args) {

       //✅ Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine

        //   if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.


        //  side 1, side 2, side 3 ->  side1 == side 2 == side 3 ->  equilatera
        // (side1 == side 2) or side 2 == side 3 -> isosceles
        // scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side3 == side1)){
            System.out.println("This is equilateral triangle");
        } else if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
            System.out.println("This is isosceles triangle");
        }else {
            System.out.println("This is scalene");
        }


    }
}



