package coreJava;

class Userdefined extends Exception{
    public String toString(){
        return "this is my exception message";
    }
}
public class userdefined_exception {
    static void func1(int a) {
        try {
            throw new Userdefined();
        } catch (Userdefined e) {
            System.out.println(e);
        }
    }
    // this coreJava.method will not handle the exception instead it will pass on the handling to calling coreJava.method (psvm)
    static void func2(int a) throws Userdefined {
        if(a<20){
            throw new Userdefined();
        }
        else{
        System.out.println("Inside func2");}
    }
    public static void main(String args[]){
        func1(10);
        try {
            // if a = 20, then Inside func2 is printed otherwise if a = 10 then exception is catched below
            func2(10);
        }
        catch (Userdefined userdefined) {

            System.out.println(userdefined);
        }
    }
}





