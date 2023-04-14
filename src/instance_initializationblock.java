public class instance_initializationblock {
    private int x;

    // Initialization block
    {
        System.out.println("Inside Initialization block ");
        System.out.println("x:"+ x);
        x=5;
    }

    // Default Constructor
    instance_initializationblock(){
        System.out.println("Inside Constructor");
        System.out.println("x:"+x);
        x=x+2;
        System.out.println("x:"+x);
    }

    public static void main(String[] args) {

        instance_initializationblock i11 = new instance_initializationblock();
        instance_initializationblock i2 = new instance_initializationblock();

    }
}

/*Output
// for i1 object
Inside Initialization block
x: 0
Inside Constructor
x: 5
x: 7
// for i2 object
Inside Initialization block
x: 0
Inside Constructor
x: 5
x: 7
*/
