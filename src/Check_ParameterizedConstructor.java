class DummyOne{
    DummyOne(){System.out.printf("DummyOne\n");}
    DummyOne(int x,int y){
        System.out.printf("Values of DummyOne are: %d %d\n",x,y);
    }}
class DummyTwo extends DummyOne{
    DummyTwo(int x,int y){
        //super(x,y);
        System.out.printf("Values of DummyTwo are: %d %d",x,y);
    }
}

public class Check_ParameterizedConstructor {
    public static void main(String ...args){
        DummyTwo dt=new DummyTwo(20,30);
    }
}
