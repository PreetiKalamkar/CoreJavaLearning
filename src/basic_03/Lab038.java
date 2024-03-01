package src.basic_03;

public class Lab038 {
        public static void main(String[] args){

            // Ternary operator
            // int a = condition ? if this is true print do this : If false do this

            // Max in two numbers ?

            int a = 40;
            int b = 20;
            int c = 32;

            //-> ?
            // a>b && a>c -> a

            // (a>c) ? a:c
            //((b>c) ? b:c)

            int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
            System.out.println(max);
    }
}
