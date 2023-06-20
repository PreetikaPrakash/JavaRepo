package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArraytoList {

    public static void main(String[] args) {
        String arr[] = new String[5];
        arr[0]="Mango";
        arr[1]="Apple";
        arr[2]="Kiwi";
        arr[3]="Watermelon";

        // CONVERSION METHOD 1
        List<String> ls = Arrays.asList(arr);
        for(String x:ls){
            System.out.print(x+" |  \n");
        }

        // CONVERSION METHOD 2
        List<String> lss = new ArrayList<String>();
        for(String x:arr){
            lss.add(x);
        }
        System.out.println(lss);


    }
}
