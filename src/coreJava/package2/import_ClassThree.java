package coreJava.package2;


public class import_ClassThree {

    public void displayClassThreeName(){
        System.out.println("This is class three");
    }

    public static void main(String[] args) {

        import_ClassTwo tw = new import_ClassTwo();
        tw.displayClassTwoName();

    }


}
