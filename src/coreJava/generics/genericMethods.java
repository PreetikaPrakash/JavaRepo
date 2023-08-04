package coreJava.generics;

public class genericMethods<T> {

    static <T>void store(T[] itemList){
        for(T x: itemList){
            System.out.println(x);
        }
    }

    // VARIABLE ARGUMENT
    static <T>void store2(T... itemList){
        for(T x: itemList){
            System.out.println(x);
        }
    }

    // BOUNDS ON GENERIC METHOD
    static <T extends Number>void store3(T[] itemList){
        for(T x: itemList){
            System.out.println(x);
        }
    }


    public static void main(String[] args){

        store(new String[]{"AAA","BBB","CCC"});
        store(new Integer[]{10,20,30});

        // VARIABLE ARGUMENT ACCEPTS LIKE THIS
        store2(40,50,30);
        store2("DDD","EEE","FFF");

        // CHECKING BOUNDS
        store2(40,50,30);


    }

}

