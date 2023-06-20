package coreJava;

class localouterclass{
    int p=10;
    void classmethod(){
        int k=20;
        class localclass{
            int l=30;
            void localclass_method(){
                System.out.println(p);
                System.out.println(k);
                System.out.println(l);
            }
        }
        localclass lc = new localclass();
        lc.localclass_method();
    }
}
public class local_innerclass {
    public static void main(String ...args){
        localouterclass loc = new localouterclass();
        loc.classmethod();
    }
}
