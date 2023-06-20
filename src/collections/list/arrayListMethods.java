package collections.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
methods most used

1.add(index, Object element) - adds element at specified index
2.add(Object elements) - it adds element to end of list.
3.addAll(Collection c) - ?
4.addAll(index, Collection c) -
5.clear() - remove elements from the list
6.clone() - ?
7.contains(element) - returns true, if list contains the element
8.get(index) - returns the element at this index
9.indexOf(element) - index of first occurance of element returns else if not there then -1 returned
10.isEmpty() - returns true if list empty
11.lastIndexOf(element) - last index of occurance of element returns else if not there then -1 returned
12.listIterator() - returns list iterator over the elements in list.
13.listIterator(index) - returns list iterator over the elements in list. starting at index
14.remove(index) - removes element at this index
15.remove(Object element) - removes first occurence of this element
16.removeAll(Collection c) - removes from list all of collection elements
17.removeIf(Predicate filter) - removes elements which statisfy this condition
18.removeRange(fromIndex,toIndex) - removes elements from between these two indexes
19.retainAll(Collection<> c) - retains only those elements that are part of this collection
20.set(index,Element) - sets the index with this element
21.size()- returns no. of elements in list
22.subList(fromIndex,toIndex) - returns view of the portion of list fromindex - toindex
23.toArray() - returns in array form all the elements in correct order
24.toArray(Object[] o) - same as above
25.trimToSize() - used for trimming the capacity of arraylist's instance to list's currecnt size.

*/

public class arrayListMethods {
    public static void method_add(ArrayList<Integer > arr, int a) {
        // add(element)
            arr.add(a);
            System.out.println(arr); // because this is a list it can be printed directly
    }
    public static void method_addIndex(ArrayList<Integer > arr, int a, int i) {
        // add(index,element)
            arr.add(i, a);
            System.out.println(arr);
    }
    public static void method_addCollection(ArrayList<Integer > arr, int a, int i) {
        // addAll(Collection c)
            ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
            arr1.add(4); // [4]
            arr.addAll(arr1); //[2,9,4]
            System.out.println(arr);
    }
//
//        // addAll(index,Collection c)
//            arr1.add(3); //[4,3]
//            arr1.add(5); //[4,3,5]
//            arr.addAll(2,arr1); // previous arr =[2,9,4]  arr1 = [4,3,5] // and now after this line execution it will be [2,9,4,3,5,4]
//            System.out.println(arr);



    public static void main(String[] args) {
        System.out.println("---CHOOSE ARRAYLIST METHOD---");
        System.out.println("1. add");
        System.out.println("2. clear");
        System.out.println("3. clone");
        System.out.println("4. contains");
        System.out.println("5. get");
        System.out.println("6. indexOf");
        System.out.println("7. isEmpty");
        System.out.println("8. lastIndexOf");
        System.out.println("9. listIterator");
        System.out.println("10. remove");
        System.out.println("11. retainAll");
        System.out.println("12. set");
        System.out.println("13. size");
        System.out.println("14. sublist");
        System.out.println("15. toArray");
        System.out.println("16. trimtoSize");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("You have selected #1 (add)\n");

            // arraylist created
            ArrayList<Integer> arr = new ArrayList<Integer>(5);
            System.out.println("Currently ArrayList is empty");

            System.out.println("\ni- add(element)\n");
            System.out.println("Enter 1 element to be added");
            Scanner sc_add = new Scanner(System.in);
            int value_add = sc_add.nextInt();
            method_add(arr,value_add);

            System.out.println("\nii- add(index,element)");
            System.out.println("Enter first value then index");
            Scanner sc_addIndex = new Scanner(System.in);
            int value_addIndex = sc_addIndex.nextInt();
            int value_Index = sc_addIndex.nextInt();
            method_addIndex(arr,value_addIndex,value_Index);
            System.out.println("\niii- addAll(Collection c)");
            System.out.println("iv- addAll(index,Collection c)");


        }



    }
}
