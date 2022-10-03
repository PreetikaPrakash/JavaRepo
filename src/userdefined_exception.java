
public class userdefined_exception {
    class Userdefined extends Exception{
        public String toString(){
            return "this is my exception message";
        }
    }
    public static void main(String args[]){
        myclass cl = new myclass();
        cl.func1(10);
    }
    }

class myclass {
    static void func1(int a) {
        try {
            System.out.println(4 / 0);
            throw new Userdefined();
        } catch (Userdefined e) {
            System.out.println(e);
        }
    }
}