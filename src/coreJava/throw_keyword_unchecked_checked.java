package coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throw_keyword_unchecked_checked {
    // unchecked
    static void func1(int age){
        if(age<18){
            // Arithmetic exception is unchecked exception so it is not mandatory to include try catch
            throw new ArithmeticException("Not eligible to vote");
        }
        else
        {
            System.out.println("Eligible to vote");
        }
    }

    //checked
    static void func2() throws FileNotFoundException {
        //IOException
        FileInputStream fo = new FileInputStream("src/file.txt");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age and check are you eligible to vote?");
        int age = sc.nextInt();
        func1(age);
        try {
            func2();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
