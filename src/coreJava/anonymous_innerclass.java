package coreJava;
abstract class anonymous_outerclass{
    void display(){
    System.out.println("hello");
    }}
class anonymous {
    public void screen(){
        anonymous_outerclass ao = new anonymous_outerclass() {
            @Override
            void display() {
                //super.display();
                System.out.println("hello inside anonymous");
            }
        };
        ao.display();
    }
}
public class anonymous_innerclass {
    public static void main(String ...args){
        anonymous a = new anonymous();
        a.screen();
    }
}
