package coreJava;

class A5A{}
class B5B extends A5A{}
class C5C extends A5A{}

public class genericArguments<T> {

    T arr[]=(T[])new Object[6];
    int len=0;

    public void append(T item){

        arr[len++] =item;
    }
    void display(){
        for(T x: arr){
            System.out.println(x);
        }
    }
    // GENERIC ARGUMENTS - WILDCARD(ALIAS)
    static void store4(genericArguments<?> obj) {
        obj.display();
    }
    // UPPER BOUND
    static void store5(genericArguments<? extends Number> obj) {
        obj.display();
    }
    // LOWER BOUND
    static void store6(genericArguments<? super A5A> obj) {
        obj.display();
    }
    // LOWER BOUND
    static void store7(genericArguments<? super B5B> obj) {
        obj.display();
    }
    // LOWER BOUND
    static void store8(genericArguments<? super C5C> obj) {
        obj.display();
    }

    public static void main(String[] args) {
        // GENERIC ARGUMENTS
        genericArguments gm = new genericArguments<>();
        gm.append("Hello");
        store4(gm);
        gm.append(44.5f);
        store4(gm);

        // for checking super methods of store6
        genericArguments<A5A> ama = new genericArguments<>();
        genericArguments<B5B> bma = new genericArguments<>();
        genericArguments<C5C> cma = new genericArguments<>();
        store6(ama);
        //store6(bma);
        //store6(cma);

        // for checking super methods of store7
        genericArguments<A5A> ama1 = new genericArguments<>();
        genericArguments<B5B> bma1 = new genericArguments<>();
        genericArguments<C5C> cma1 = new genericArguments<>();
        store7(ama1);
        store7(bma1);
       // store7(cma1);

        // for checking super methods of store8
        genericArguments<A5A> ama2 = new genericArguments<>();
        genericArguments<B5B> bma2 = new genericArguments<>();
        genericArguments<C5C> cma2 = new genericArguments<>();
        store8(ama2);
      //  store8(bma2);
        store8(cma2);

    }
    }





