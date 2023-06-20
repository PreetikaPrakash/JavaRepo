package coreJava;

import java.util.Scanner;

/*OBJECTIVE
* catch Arithmetic exception of Division by 0
* */
public class try_catch {
    public static void main(String...args){
        System.out.println("Enter two numbers for division-");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("Output:");
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("You can't give 0 as the second number, try again");
        }
        System.out.println("End of the Program");

    }

}
