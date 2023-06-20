package collections.cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {

    public static void main(String[] args) {
            List<String> ls = new ArrayList<>();
            ls.add("yellow");
            ls.add("green");
            ls.add("blue");
            ls.add("pink");
            ls.add("red");

            // FORWARD PRINTING
            ListIterator li = ls.listIterator();
            while(li.hasNext()){
                System.out.print(li.nextIndex()+" "+li.next()+" ");
            }

        System.out.println();

            // BACKWARD PRINTING
            while(li.hasPrevious()){
                System.out.print(li.previousIndex()+" "+li.previous()+" ");
            }
    }
}
