package src.basic_05_23Dec;

public class Lab087 {
    public static void main(String[] args) {

        for (int i=1; i<= 10; i++){
            if(i%2==0){
                System.out.println(i + " is Even number");
                continue;
            }
            System.out.println(i + " is Odd number");
        }
    }
}
