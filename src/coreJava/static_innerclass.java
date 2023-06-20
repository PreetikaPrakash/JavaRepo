package coreJava;

class outer_staticclass{
    static int x =60;
    int y = 70;

    static class innerclass{
        static int t = 1;
        int s = 2;
        void display(){
            System.out.println(x);
            //System.out.println(y); non-static; can't access
            System.out.println(t);
            System.out.println(s); // can access non-static inside its own class
        }
    }
}
public class static_innerclass {
    public static void main(String ...args){
        outer_staticclass.innerclass oiu =new outer_staticclass.innerclass();
        oiu.display();
    }
}
