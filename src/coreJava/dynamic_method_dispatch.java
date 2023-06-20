package coreJava;

class dynamic{
    public void classname(){System.out.println("Classname is coreJava.dynamic");}
}
class method extends dynamic{
    @Override
    public void classname(){System.out.println("Classname is coreJava.method");}

    public void func(){System.out.println("Second function of Child class");}
}
public class dynamic_method_dispatch {
    public static void main(String ...args){
        dynamic m = new method();
        m.classname();
        // Below can't access a function that is newly defined in child class and is not a part of parent class.
        // m.func();
    }

}
