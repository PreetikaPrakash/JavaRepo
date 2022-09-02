/* OVERVIEW -
    - A Class inside a class, but in a hierarchy.
    - outer class holds inner class
    - How can inner class access outer class variables and methods ?
    - How can outer class " ?
    - can outer and inner override ?
    - Can/How main function call outer/inner ?
    - is strict/non-strict hierarchy applicable here ?

*/
class NestedOuter{
    final int outer = 50;

    public class NestedInner{
        int inner = 100;
        void screen(){
            System.out.println("Calling innerclass");
            System.out.println(outer);
        }
        //outer = 40;
    }
    void display(){
        System.out.println("Calling outerclass");
    }
}
public class nested_innerclass {

}
