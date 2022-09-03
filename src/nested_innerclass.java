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
