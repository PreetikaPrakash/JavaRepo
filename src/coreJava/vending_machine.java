package coreJava;

import java.util.Scanner;

public class vending_machine {
    public String[] stock(int a){
        // items in vending machine

        int tray_no=0;
        String tray_item,tray_price;
        String s[]={"null","null"};

            if (a == 1) {
                tray_item = "Biscuit";
                tray_price = "5";
                s[0] = tray_item;
                s[1] = tray_price;
            } else if (a == 2) {
                tray_item = "Chocolate";
                tray_price = "23";
                s[0] = tray_item;
                s[1] = tray_price;
            } else if (a == 3) {
                tray_item = "Chips";
                tray_price = "25";
                s[0] = tray_item;
                s[1] = tray_price;
            } else if (a == 4) {
                tray_item = "Juice";
                tray_price = "66";
                s[0] = tray_item;
                s[1] = tray_price;
            } else if (a == 5) {
                tray_item = "Ice Cream";
                tray_price = "100";
                s[0] = tray_item;
                s[1] = tray_price;
            } else if (a == 6) {
                tray_item = "Coffee";
                tray_price = "51";
                s[0] = tray_item;
                s[1] = tray_price;
            }
            return s;
        }

    public void processing(boolean process,int priceitem){
        int finalprice = 0;
            System.out.println("Please enter note amount and no of notes. Press ‘y’ if done");

            Scanner sc2 =  new Scanner(System.in);
                String str1 = sc2.nextLine();


                String[] arrOfStr = str1.split(",", 2);
                int note= Integer.parseInt(arrOfStr[0]);
                int no_of_note = Integer.parseInt(arrOfStr[1]);
                if(note==1||note==5||note==10||note==100){
                    calculateprice(note,no_of_note,priceitem,finalprice);

                }
                else{
                    System.out.println("Enter valid notes");
                }

        }
    public void calculateprice(int note, int no_of_note,int priceitem,int finalprice){

        int cal= note * no_of_note;
        finalprice = finalprice+cal;

        if (priceitem==finalprice){
            System.out.println("Thankyou for your purchase");
        }
        else{
            System.out.println("Enter amount again");
            Scanner sc2 =  new Scanner(System.in);
            String str2 = sc2.nextLine();
            String[] arrOfStr2 = str2.split(",", 2);
            int note2= Integer.parseInt(arrOfStr2[0]);
            int no_of_note2 = Integer.parseInt(arrOfStr2[1]);
            //System.out.printf("%1d %2d %3d %4d\n",note2,no_of_note2,priceitem,finalprice);
            calculateprice(note2,no_of_note2,priceitem,finalprice);

        }
    }
    public static void main(String args[]){
        vending_machine vm = new vending_machine();
        Scanner sc =  new Scanner(System.in);
        String itemlist[] = new String[3];

        System.out.println("Enter tray no");

        int tray_num = sc.nextInt();

        try {
            itemlist = vm.stock(tray_num);
            System.out.println("Item : "+itemlist[0]);
            System.out.println("Price :"+itemlist[1]);
            int priceitem= Integer.parseInt(itemlist[1]);

            System.out.println("Proceed with payment ?");
            boolean proceed = sc.hasNext();
            if(proceed){
            vm.processing(proceed,priceitem);}
            else{
                System.out.println("Aborted");
            }

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter a valid tray number");
        }

    }
}
