final class finals_class{
    public void display(){
        System.out.println("This is final class");
    }
}

public class final_class{
    public static void main(String...args){
        finals_class fc = new finals_class();
        fc.display();
    }
}
/*
-> OUTPUT
   This is final class
*/