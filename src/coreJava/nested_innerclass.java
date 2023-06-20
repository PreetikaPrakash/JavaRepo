package coreJava;

class NestedOuter{
    int outer = 50;
    void display(){
        System.out.println("Calling outerclass");
    }
    protected class NestedInner{
        int inner = 100;
        void display(){
            System.out.println("Calling innerclass");
        }
    }
    }
public class nested_innerclass {
    public static void main(String ...args){
        NestedOuter.NestedInner nsi= new NestedOuter().new NestedInner();
        nsi.display();

        NestedOuter ns = new NestedOuter();
        ns.display();
    }
}
