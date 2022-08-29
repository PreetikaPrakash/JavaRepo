class parent_one{
    public parent_one(){
        System.out.println("A called");
    }
    public parent_one(int x,int y){
        System.out.printf("Default A %d %d \n", x,y);
    }
}
class child_one extends parent_one{
    public child_one(int x,int y){
        System.out.printf("Default B %d %d \n", x,y);
    }
}

public class Constructor_Inheritance_One {
    public static void main(String ...args){
        child_one one = new child_one(23,34);
        System.out.println("--------------");
    }
}
