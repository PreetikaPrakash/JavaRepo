package coreJava;

class SupA{}
class SubB extends SupA{}

class SuperMethod{
    public SupA method(){System.out.println("coreJava.SuperMethod is here");
    return new SupA();}
}
class SubMethod extends SuperMethod{
    // can return object of parent class
    /*@Override
    public coreJava.SupA coreJava.method(){System.out.println("coreJava.SubMethod is here");
        return new coreJava.SupA();
    }*/

    // can also return object of child class
    @Override
    public SubB method(){System.out.println("coreJava.SubMethod is here");
        return new SubB();
    }
}
public class multiple_class_dynamic_method_dispatch {
    public static void main(String ...args){
        SuperMethod sm = new SubMethod();
        sm.method();
    }
}
