package coreJava.package2;
import coreJava.package1.import_ClassOne;

public class import_ClassTwo  {

    public void displayClassTwoName(){
        System.out.println("This is class two");
    }

    public static void main(String[] args) {

        import_ClassThree tH = new import_ClassThree();
        tH.displayClassThreeName();

        import_ClassTwo tt = new import_ClassTwo();
        //tt.displayClassOneName(); ---cant create

        import_ClassOne te = new import_ClassOne();
        te.displayClassOneName();
        //te.displayClassTwoName(); ---cant create

    }

}
