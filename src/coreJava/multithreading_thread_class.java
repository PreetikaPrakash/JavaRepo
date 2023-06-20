package coreJava;

public class multithreading_thread_class extends Thread{
// In a single class
// Both for loops run simultaneously
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("coreJava.A print");
        }
    }


    public static void main(String[] args){

        multithreading_thread_class th = new multithreading_thread_class();
        th.start();

        for (int i=0;i<=100;i++){
            System.out.println("coreJava.AA print");
        }

    }

}
// Output
/*
coreJava.AA print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.A print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print
coreJava.AA print

Process finished with exit code 0

* */
