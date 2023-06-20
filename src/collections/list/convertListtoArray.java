package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class convertListtoArray {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("Pen");
        ls.add("Paint Brush");
        ls.add("Sharpener");
        ls.add("Eraser");
        ls.add("Box");


        String arr[] = ls.toArray(new String[ls.size()]);
        System.out.println(Arrays.toString(arr));


    }
}
