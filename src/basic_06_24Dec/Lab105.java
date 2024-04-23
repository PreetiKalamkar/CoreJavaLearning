package src.basic_06_24Dec;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

       // Take input user Marks of 5 subjects and Print the marks
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter first subject marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter second sub marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter third sub marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter fourth sub marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter fifth sub marks");
        marks[4] = sc.nextFloat();

        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        sc.close();

    }
}
