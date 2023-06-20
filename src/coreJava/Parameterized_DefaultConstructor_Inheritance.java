package coreJava;

class AAA{
    public AAA(){System.out.println("Default coreJava.A Constructor");}
    public AAA(int x,int y){
        System.out.printf("Default coreJava.A %d %d \n", x,y);
    }
}
class BBB extends AAA{
    public BBB(){System.out.println("Default coreJava.B Constructor");}
    public BBB(int x,int y){
        System.out.printf("Default coreJava.B %d %d \n", x,y);
    }
}
class CCC extends BBB{
    public CCC(int x,int y){
        System.out.printf("Default coreJava.C %d %d \n", x,y);
    }
}

public class Parameterized_DefaultConstructor_Inheritance {
    public static void main(String ...args){
        CCC c = new CCC(10,20);
        System.out.println("--------------");
        BBB b = new BBB(30,40);
    }
}
