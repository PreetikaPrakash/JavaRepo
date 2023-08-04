package coreJava.generics;

public class genericArray<T> {
    int length=0;
    // generic array
    T arr[]=(T[])new Object[6];

    // append to generic array
    public void append(T item) {
        arr[length++] =item;
    }
    // display generic array elements
    public void disp() {
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }

    public static void main(String... args){
        genericArray<Integer> ga = new genericArray<>();
        ga.append(90);
        ga.append(new Integer(50));
        ga.append(70);
        ga.append(60);
        ga.append(40);
        ga.disp();

    }
}
