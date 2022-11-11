package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratorsCollection {
    private static void Iteration_Method_One(ArrayList<Integer> a){
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i));
        }
    }
    private static void Iteration_Method_ForEach(ArrayList<Integer> a){
      for(Integer x:a){
          System.out.print(x);
      }
    }
    private static void Iteration_Method_GenericForEach(ArrayList<Integer> a){
        for(var x:a){
            System.out.print(x);
        }
    }
    private static void Iteration_Method_LambdaForEach(ArrayList<Integer> a){
        a.forEach((x)-> {
            System.out.print(x);
        });
    }
    private static void Iteration_Method_Iterator(ArrayList<Integer> a){
       Iterator<Integer> it = a.iterator();
       while (it.hasNext()){
           System.out.print(it.next());
       }
    }
    private static void Iteration_Method_ListIterator(ArrayList<Integer> a){
        ListIterator<Integer> it = a.listIterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
//        it.hasPrevious();
//        it.previousIndex();
//        it.previous();
    }
    private static void Iteration_Method_ListIteratorForEach(ArrayList<Integer> a){
        // here instead of while loop using for loop
        for (ListIterator<Integer> it = a.listIterator(); it.hasNext();)
        {
            System.out.print(it.next());
        }

    }
    private static void Iteration_Method_ListclassForEach(ArrayList<Integer> a){
        a.forEach(System.out::print);
    }
    private static void Iteration_Method_foreachlabmda(ArrayList<Integer> a){
        a.add(7);
        a.forEach(n->show(n));
        // show method will print only when n>6
    }

    static void show(int n){
        if(n>6)
            System.out.print(n);
    }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>(List.of(1,2,3,4));
        // METHODS OF ITERATING ARRAYLIST
        Iteration_Method_One(al2);
        System.out.println("\n");
        Iteration_Method_ForEach(al2);
        System.out.println("\n");
        Iteration_Method_GenericForEach(al2);
        System.out.println("\n");
        // LAMBDA EXPRESSION - FOR EACH
        Iteration_Method_LambdaForEach(al2);

        // ITERATOR CLASS REFERENCE
            // forward direction
        System.out.println("\n");
        Iteration_Method_Iterator(al2);

        // LIST ITERATOR
            // front and back movements possible(bidirectional)
        System.out.println("\n");
        Iteration_Method_ListIterator(al2);
        // LIST ITERATOR - FOR EACH
        System.out.println("\n");
        Iteration_Method_ListIteratorForEach(al2);

        // for each of list class - lambda
        System.out.println("\n");
        Iteration_Method_ListclassForEach(al2);

        // foreach - lambda - another function
        Iteration_Method_foreachlabmda(al2);
    }
}

