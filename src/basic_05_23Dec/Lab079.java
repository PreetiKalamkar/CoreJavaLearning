package src.basic_05_23Dec;

public class Lab079 {
    public static void main(String[] args){

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        System.out.println("I want to print the value of i, but break when i=5");

        for(int i=1; i <= 10; i++){
           System.out.println("Value of " + i);
            if(i == 5){
                break;
            }
            //System.out.println("Val of " + i );
        }
        System.out.println("End");



    }

}
