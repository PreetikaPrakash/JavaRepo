public class static_initilizationblock {

    static int y;

    // static block
    static {
        System.out.println("Inside Static block y:"+y);
        y=y+10;
        System.out.println("y:"+y);
    }

    public static void main(String[] args) {
        System.out.println("Inside PSVM"+y);
    }
}

// Output
/*
* Inside Static block y:0
* y:10
* Inside PSVM 10
*
* */