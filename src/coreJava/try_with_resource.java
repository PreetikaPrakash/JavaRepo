package coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class try_with_resource {
    static void myfunc() throws IOException {
        try(FileInputStream f = new FileInputStream("file.txt"))
        {
            System.out.println("Inside try block of myfunc");
        }
        // no catch is needed
        System.out.println("Outside try block of myfunc");
    }
    public static void main(String args[]){
        try {
            myfunc();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
