package coreJava.generics;

public class genericClass<T> {
// Generic Class for storing,retrieving object(item) of any type

    // Data member
    private T item;

    // setmethod
    public void setmethod(T para){
        item = para;
    }

    // getmethod
    public T getmethod(){
        return item;
    }

    public static void main(String... args){
        genericClass<String> gc = new genericClass<>();
        // store to item-object with any of the below coreJava.method
        gc.item="wee";
        System.out.println(gc.getmethod());
        // OR
        gc.setmethod("qeeee");
        System.out.println(gc.getmethod());


    }
}

