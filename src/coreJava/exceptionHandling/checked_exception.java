package coreJava.exceptionHandling;/*Observation
* where try - catch is mandatory
*  */
import java.io.*;
public class checked_exception {
    public static void main(String args[]){
        try {
            FileInputStream fs = new FileInputStream("MyFile.txt");
        }
        catch(IOException e){ // sub
            System.out.println(e);
        }
        catch(Exception e){ // super
            System.out.println(e);
        }

    }
}
