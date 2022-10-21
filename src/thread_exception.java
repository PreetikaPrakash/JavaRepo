class MyRunClass implements Runnable{
    public void run(){
        for(int i =0; i<=10; i++){
            System.out.printf("hey %d \n", i);
            try
            {
                Thread.sleep(100);

            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
    }
}

public class thread_exception {

    public static void main(String[] args){
        MyRunClass my = new MyRunClass();
        Thread t = new Thread(my);
        //Thread t2 = new Thread(my);
        t.start();
        t.start(); // will cause exception (same object)
        //t2.start(); // No exception (different object)
    }

}
