package src.basic_04_17Dec;

import java.util.Scanner;

public class Lab057 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name - chrome, firfox, mozila, etc");
        // as per browser entered, code for particular browser will execute

        String browser = sc.nextLine();

        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the firefox code");
                break;
            case "Edge":
                System.out.println("Execute the edge code");
                break;
            case "Opera":
                System.out.println("Execute the opera code");
                break;
            case "incognito":
                System.out.println("Execute the incognito code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
        System.out.println("Are you satisfied ?");
    }
}



