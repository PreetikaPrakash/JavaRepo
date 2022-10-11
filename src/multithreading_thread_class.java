public class multithreading_thread_class extends Thread{
// In a single class
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("A print");
        }
    }


    public static void main(String[] args){

        multithreading_thread_class th = new multithreading_thread_class();
        th.start();

        for (int i=0;i<=100;i++){
            System.out.println("AA print");
        }

    }

}
