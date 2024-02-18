package src.basic_02;

public class Lab008 {

    public static void main(String[] args) {

        int number = 9;
        System.out.printf("%d*1=%d*1",number,9);

        System.out.println();

        // Why we are using this?
        // Formatting purpose
        String name = "Preeti";  //Bunch of char

        //Concate +
        System.out.println("My name is " + name);

        //Fomatting (printf)
        System.out.printf("My name is -> %s",name);

        System.out.println();

        float pi = 3.14159f;
        System.out.printf("Your value is %f",pi);

    }
}
