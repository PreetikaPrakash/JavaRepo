package coreJava;

class A{
    public A(){
        System.out.println("Default coreJava.A");
    }
}
class B extends A{
    public B(){
        System.out.println("Default coreJava.B");
    }
}
class C extends B{
    public C(){
        System.out.println("Default coreJava.C");
    }
}

public class Default_Constructor_Inheritance {
    public static void main(String ...args){
        C c = new C();
        System.out.println("------");
        B b = new B();
    }
}
