// Thread();
// Thread(String name);
// Thread(Runnable r);
// Thread(Runnable r, String name);

// Thread(Runnable r);
class MyRunnableClass1 implements Runnable{
    public void run(){
        System.out.println("INSIDE --Thread(Runnable r)");
    }
}

// Thread(Runnable r, String name);
class MyRunnableClass2 implements Runnable{
    public void run(){
            System.out.println("INSIDE --Thread(Runnable r, String name)");
    }
}

// Thread(String name);
class MyRunnableClass3 extends Thread{

    MyRunnableClass3(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+5);
    }
    public void run(){
        System.out.println("INSIDE --Thread(String name)");
        for(int i =0 ; i<=10;i++){
            try{


                System.out.println("Executed "+i);
                Thread.sleep(100);

            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}

public class thread_constructor_methods {

    public static void main(String[] args){

        System.out.println("--------------------");
        // Thread(Runnable r);
        MyRunnableClass1 my1 = new MyRunnableClass1();
        Thread t1 = new Thread(my1);
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getState());

        System.out.println("--------------------");
        // Thread(Runnable r, String name);
        MyRunnableClass2 my2 = new MyRunnableClass2();
        Thread t2 = new Thread(my2, "My Second Thread");
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getState());

        System.out.println("--------------------");
        // Thread (String name);
            // For this we need to create parameterized constructor
        MyRunnableClass3 my3 = new MyRunnableClass3("My Third Thread");
        System.out.println(my3.getId());
        System.out.println(my3.getName());
        System.out.println(my3.getPriority());
        System.out.println(my3.getState());
        System.out.println(my3.isAlive());
        System.out.println(my3.isDaemon());
        my3.start();
        my3.interrupt();
        System.out.println(my3.getState());
        System.out.println(my3.isAlive());
        System.out.println(my3.isDaemon());




    }

    }

