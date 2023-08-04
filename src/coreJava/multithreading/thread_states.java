package coreJava.multithreading;

public class thread_states implements Runnable {

    // Reference variable of Thread class and coreJava.multithreading.thread_states class is created.
    public static Thread t1;
    public static thread_states obj;

    // 1st PSVM is executed
    // Thread 1 is started here
    public static void main(String argvs[]) {
        // creating an object of the class ThreadState
        obj = new thread_states();
        t1 = new Thread(obj);

        // T1 new state
        System.out.println("T1 new state - " + t1.getState());
        t1.start();
        // T1 runnable state
        System.out.println("T1 runnable state - " + t1.getState());
        System.out.println("---------");
    }

    // 2nd this function is executed
    // Thread 2 is started here
    public void run() {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

        // T2 NEW state.
        System.out.println("T2 new state - " + t2.getState());
        t2.start();
        // T2 runnable state
        System.out.println("T2 runnable state - " + t2.getState());
        System.out.println("---------");



        System.out.println("888");
        try
        {
            System.out.println("8");
            // moving the thread t1 to the state timed waiting
            // calls thread 1 how ? it calls based on the object, current class is coreJava.multithreading.thread_states so its object is only called
            // acc to line 11, 12
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 after invoking the coreJava.method sleep() on it - "+ t2.getState() );

        System.out.println("666");
        try
        {
            System.out.println("6");
            // waiting for thread t2 to complete its execution
            t2.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
    }
}
// CREATING THREAD USING RUNNABLE INTERFACE
class ABC implements Runnable
{

    public void run()
    {
        System.out.println("777");
        try
        {
            // moving thread t2 to the state timed waiting
            Thread.sleep(100);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t1 while it invoked the coreJava.method join() on thread t2 -"+ thread_states.t1.getState());

        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }


    }
}
