package src.basic_03;

import java.sql.SQLOutput;

public class Lab033 {
        public static void main(String[] args){

            String name = "The Testing Academy";
            String name1 = "The Testing Academy";
            String name2 = new String("The Testing Academy");

//            System.out.println(name == name1);
//            System.out.println(name.equals(name1));

           // System.out.println(name1 == name2);

            System.out.println(name == name2);

            System.out.println(name.equals(name2));
            System.out.println(name.equalsIgnoreCase(name2));


    }
}
