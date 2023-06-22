package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class listmethods {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(100);
        System.out.println(l);
        // clear()
            // remove elements from the list
                l.clear();
                System.out.println(l); // []

        // equals(Object o)
            // Object should be passed in parameter not element
            // Return boolean
                List<Integer> l1 = new ArrayList<Integer>();
                l1.add(100);
                System.out.println(l.equals(l1)); // false

                List<Integer> l2 = new ArrayList<Integer>();
                l2.add(100);
                System.out.println(l2);
                System.out.println(l1.equals(l2)); // true

        //hashCode()
            // returns hashcode of list
                System.out.println(l2.hashCode()); // 131
                System.out.println(l1.hashCode()); // 131
                System.out.println(l.hashCode()); // 1

        //isEmpty()
            // returns true; list empty
            // returns false; list not empty
                System.out.println(l.isEmpty());// true
                System.out.println(l1.isEmpty());// false

        //lastIndexOf(Object o)
            // returns the last occurence of the element passed
            // returns -1 if element not present
                System.out.println(l1.lastIndexOf(100)); // 0
                System.out.println(l.lastIndexOf(100)); // -1

        //toarray()
            // Converts arrayList, linkedlist to array
                l2.add(400);
                System.out.println(l2);// [100,400]
                System.out.println(Arrays.toString(l2.toArray()));

                List<Integer> l3 = new LinkedList<Integer>();
                l3.add(500);
                l3.add(1000);
                System.out.println(Arrays.toString(l3.toArray()));

        //contains(Object o)
            //returns true if the list contains specified elements.
                System.out.println(l3.contains(500));// true

        //containsall(Collection<E> c)
            // returns true if the list contains all the elements
                List<Integer> l4 = new ArrayList<Integer>();
                l4.add(500);
                l4.add(1000);
                System.out.println(l3.containsAll(l2)); // false
                System.out.println(l3.containsAll(l4)); // true

        //sort()


        //subList(int fromIndex, int toIndex)
            // returns list
                l4.add(2000);
                l4.add(3000);
                System.out.println(l4.subList(0,3)); // [500,1000,2000]

        //size()
                System.out.println(l4.size()); // 4

        // Convert Array to List
            // Method 1 : Arrays.asList(a)
                System.out.println(Arrays.asList(l4)); // [[500, 1000, 2000, 3000]]
            // Method 2 : use for-each loop
                int[] arr2 = new int[]{5,4,3,2,1};
                List<Integer> l5 = new ArrayList<Integer>();
                for(Integer i: arr2){
                        l5.add(i);
                }
                System.out.println(l5);

    }





}
