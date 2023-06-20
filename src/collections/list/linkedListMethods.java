package collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        // ADD
            System.out.println("\n--Add--");
            ll.add("Preetika");
            ll.add("Linked");
            ll.add("List");
            ll.add("Collection");
            ll.addFirst("First");
            ll.addLast("Prakash");
            ll.add("Collections");
            ll.add("Prakash");
            System.out.println(ll);

        // ITERATOR
            Iterator<String> i = ll.iterator();
            System.out.println("\n--Iterator--");
            while (i.hasNext()){
                System.out.println(i.next());
            }
        // REMOVE
            System.out.println("\n--Remove--");
            ll.remove(0);
            ll.remove("Linked");
            ll.removeFirst();
            ll.removeLast();
            ll.removeFirstOccurrence("Collection");
            ll.removeLastOccurrence("Prakash");
            System.out.println(ll);

        // REVERSE ITERATION
            System.out.println("\n--Reverse Iteration--");
            Iterator il = ll.descendingIterator();
            while(il.hasNext()){
                System.out.print(il.next()+" ");
            }


        }
    }

