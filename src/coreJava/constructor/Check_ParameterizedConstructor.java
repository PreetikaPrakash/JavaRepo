package coreJava.constructor;

class DummyOne{
    DummyOne(){System.out.printf("coreJava.constructor.DummyOne\n");}
    DummyOne(int x,int y){
        System.out.printf("Values of coreJava.constructor.DummyOne are: %d %d\n",x,y);
    }}
class DummyTwo extends DummyOne{
    DummyTwo(int x,int y){
        //super(x,y);
        System.out.printf("Values of coreJava.constructor.DummyTwo are: %d %d",x,y);
    }
}

public class Check_ParameterizedConstructor {
    public static void main(String ...args){
        DummyTwo dt=new DummyTwo(20,30);
    }
}
