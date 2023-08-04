package coreJava.generics;

public class non_generics_Variable_and_Array {
    public static void main(String... args){


        // OBJECT VARIABLE
        Object obj = new String();

        // storing Integer object to Object reference
        obj = new Integer(10);

        // storing Object reference to string reference
        // Converting Integer to String
        String str2 =(String) obj; // will get exception at this line
        String str1 = String.valueOf(obj); // will get exception at this line

        // checking both obj and str have same reference
        System.out.println(str1.equals(obj));
        System.out.println(str2.equals(obj));

        // OBJECT ARRAY
        Object obj3[] = new Object[5];
        obj3[0]="Hi";
        obj3[1]="hello";
        obj3[2]=10;
        obj3[3]=new Integer(90);
        obj3[4]=new Double(30.5);

        String y =   (String)obj3[3];  // will get exception at this line
        System.out.println(y);
    }
}
