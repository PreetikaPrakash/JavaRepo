public class StaticClassA {

    // only include instance member variable, instance member function, static member variable and static member fucntion

    int member_variable = 10;
    public void member_function(){
        System.out.println("Inside instance member function");
        System.out.println(member_variable);
    }

    static int static_variable = 100;
    public static void static_function(){
        System.out.println("Inside static member function");
        System.out.println(static_variable);
    }


}
