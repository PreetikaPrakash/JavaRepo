package collections;

import java.util.HashSet;

public class hashSetMethods {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        // ADD
            hs.add("Lavendar tea");
            hs.add("Chamomile tea");
            hs.add("Ginger tea");
            hs.add("Lemon tea");
            hs.add("Chamomile tea");// will be ignored while iterating

        // REMOVE
            hs.remove("Ginger tea");
            hs.removeIf(str->str.contains("Lemon tea"));
            // O/p -> Lavendar tea || Chamomile tea ||

        for(String h:hs){
            System.out.print(h+" || ");
        }
        // OUTPUT IS UNORDERED
        // O/P-> Lemon tea || Lavendar tea || Chamomile tea || Ginger tea ||


    }
}
