class over{
    public static void fruits(String fruit1){
        System.out.println(fruit1);
    }
    public static void fruits(String fruit1, String fruit2){
        System.out.println(fruit1);
        System.out.println(fruit2);
    }
}
public class static_overloading extends over{


    public static void main(String...args){
        over.fruits("apple");
        over.fruits("mango","banana");
    }



}
