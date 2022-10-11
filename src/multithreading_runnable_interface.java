public class multithreading_runnable_interface implements Runnable {
    // In a single class
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("B print");
        }
    }
    public static void main(String[] args){

        multithreading_runnable_interface mri = new multithreading_runnable_interface();
        Thread thh = new Thread(mri);
        thh.start();

        for (int i=0;i<=100;i++){
            System.out.println("BB print");
        }

    }

}
