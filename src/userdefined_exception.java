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
    public static void main(String args[]){
        func1(10);
    }
}





