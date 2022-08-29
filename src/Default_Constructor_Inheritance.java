class A{
    public A(){
        System.out.println("Default A");
    }
}
class B extends A{
    public B(){
        System.out.println("Default B");
    }
}
class C extends B{
    public C(){
        System.out.println("Default C");
    }
}

public class Default_Constructor_Inheritance {
    public static void main(String ...args){
        C c = new C();
        System.out.println("------");
        B b = new B();
    }
}
