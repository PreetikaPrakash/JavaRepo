package coreJava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*OBJECTIVE
Input
12324.134
Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
* */
public class curreny_conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double currency = sc.nextDouble();

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf1.format(currency);

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String in = nf2.format(currency);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String ch = nf3.format(currency);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String ff = nf4.format(currency);

        System.out.println("US: "+us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + ff);
    }
}
