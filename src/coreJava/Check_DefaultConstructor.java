package coreJava;
class App{
    // Parent class constructor is not created explicitly
}
class Phone extends App{
    Phone(){
        System.out.println("Its phone class");
    }
}

public class Check_DefaultConstructor {
    public static void main(String ...args){
        Phone ph=new Phone();
        System.out.println(ph);
        System.out.println("Complete");

    }
}
