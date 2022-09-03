/* OVERVIEW -
    - A Class inside a class, but in a hierarchy.
    - outer class holds inner class

    - How can inner class access outer class variables and methods ?
        ->
    - How can outer class " ?
    - can outer and inner override ?
    - Can/How main function call outer/inner ?
    - is strict/non-strict hierarchy applicable here ?

*/
class NestedOuter{
    int outer = 50;
    void display(){
        System.out.println("Calling outerclass");
    }
    public class NestedInner{
        int inner = 100;
        // outer =60; -> Inner class can just access outer class variables and methods but they cant modify it.
        // display(); -> can't access
        void screen(){
            System.out.println("Calling innerclass");
            System.out.println(outer);
            display();
        }
        void access_outerproperties(){
            NestedOuter nn = new NestedOuter();
            System.out.println(nn.outer);
            nn.display();
        }
    }

    void access_innerproperties(){
        //System.out.println(inner);
        //screen();
        NestedOuter.NestedInner n = new NestedOuter.NestedInner();
        System.out.println(n.inner);
        n.screen();
    }
}
public class nested_innerclass {
    public static void main(String ...args){
        NestedOuter.NestedInner nsi= new NestedOuter().new NestedInner();
        System.out.println(nsi.inner);
        nsi.screen();
        nsi.access_outerproperties();

        NestedOuter ns = new NestedOuter();
        System.out.println("____________");
        System.out.println(ns.outer);
        ns.display();
        ns.access_innerproperties();

    }

}
