class static_blocks{
    static int y = 60;
    static void display(){
        System.out.println(y);
    }
    static{
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block 2");
    }
}
public class static_block {
    static int r =30;
    public static void main(String...args){
        static_blocks sb = new static_blocks();

        System.out.println(static_block.r);
        sb.display();
    }

}


