package coreJava;

class Word{
    Word(){
        System.out.println("coreJava.Word Default Constructor");
    }
}
class Sentence extends Word{
    Sentence(){
        this(40,45);
        System.out.println("coreJava.Sentence Default Constructor");
    }
    Sentence(int x, int y){
        //super(); when this is not commented, no change happens as the Parent class constructor is already called once above.
        System.out.printf("coreJava.Sentence Parameterized Constructor %d %d\n",x,y);
    }
}
public class this_super_constructor {
    public static void main(String ...args){
        Sentence s = new Sentence();
    }
}
/* Output :
coreJava.Word Default Constructor
coreJava.Sentence Parameterized Constructor 40 45
coreJava.Sentence Default Constructor
*/