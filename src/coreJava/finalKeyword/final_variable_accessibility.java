package coreJava.finalKeyword;

public class final_variable_accessibility {

    //final  int FUZZY; // Cannot be written without initalization.
    //FUZZY = 300;     //  Cannot be initialised like this.


    public static void main(String...args){
        final int CONST; // Can be written without initalization.
        CONST= 1000;    //  Can be modified inside a function.
    }
}
