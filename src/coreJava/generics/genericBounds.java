package coreJava.generics;

public class genericBounds<T extends Number> {
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
            } }

    public static void main(String... args){
        genericBounds<Float> ga = new genericBounds<>();

        // ga.append(90); // $Error$ -> passed value is of type Integer
        // ga.append(new Integer(50)); // $Error$ -> passed value is of type Integer
        // ga.append(33.5);// $Error$ -> passed value is of type Double
        // ga.append("hey"); // $Error$ -> passed value is of type String


        ga.append(55.5f); // No Error
        ga.disp();

    }}
