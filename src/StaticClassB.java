public class StaticClassB {

    public static void main(String[] args) {
        // First call static member variable and function of StaticClassA

            System.out.println(StaticClassA.static_variable);
            StaticClassA.static_function();


        // Second call instance member variable and function of StaticClassA
        StaticClassA a = new StaticClassA();
        System.out.println(a.member_variable);
        a.member_function();

    }
}
