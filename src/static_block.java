class static_blocks{
    static{
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block 2");
    }
}
public class static_block {

    public static void main(String...args){
        static_blocks sb = new static_blocks();
        System.out.println("Main Method");
    }

}


