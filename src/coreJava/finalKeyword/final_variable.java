package coreJava.finalKeyword;

public class final_variable {
    // Method 1 : to initialize final variable. -- declaration & initialization at once
    final int LOW = 0;

    final static int MEDIUM;
    final int HIGH;
    final int NORMAL;

    // Method 2 : to initialize final variable. -- static block
    static{
        MEDIUM = 50;
    }
    // Method 3 : to initialize final variable. -- constructor
    final_variable(){
        HIGH = 100;
    }
    // Method 4 : to initialize final variable. -- instance block
    {
        NORMAL = 500;
    }
    public static void main(String...args){
        final_variable fv = new final_variable();
        System.out.println(fv.LOW);
        System.out.println(fv.MEDIUM);
        System.out.println(fv.HIGH);
        System.out.println(fv.NORMAL);
    }

}
/* OUTPUT
0
50
100
500
*/
