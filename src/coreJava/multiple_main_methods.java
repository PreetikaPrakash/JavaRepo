package coreJava;

class multiple_main_methods_two {
    public static void main(String[] args){
        System.out.println("Class second");
        System.out.println("Class second");


    }
}
class multiple_main_methods_one {
    public static void main(String[] args){
        System.out.println("Class first");
        int x=5;
        System.out.println(++x);
        int y=5;
        System.out.println(y++);
        System.out.println("one");
        System.out.println("one");
    }
}