package coreJava.constructor;

class AA{
    public AA(int x,int y){
        System.out.printf("Default coreJava.constructor.A %d %d \n", x,y);
    }
}
class BB extends AA{
    public BB(int x,int y){
        super(x,y);
        System.out.printf("Default coreJava.constructor.B %d %d \n", x,y);
    }
}
class CC extends BB{
    public CC(int x,int y){
        super(x,y);
        System.out.printf("Default coreJava.constructor.C %d %d \n", x,y);
    }
}

public class Parameterized_SuperConstructor_Inheritance {
    public static void main(String ...args){
        CC c = new CC(10,20);
        System.out.println("--------------");
        BB b = new BB(30,40);
    }
}
