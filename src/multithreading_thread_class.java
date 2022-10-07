public class multithreading_thread_class extends Thread{

    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("A print");
        }
    }


    public static void main(String[] args){

        Thread th = new Thread();
        th.start();

        for (int i=0;i<=10;i++){
            System.out.println("B print");
        }

    }

}
