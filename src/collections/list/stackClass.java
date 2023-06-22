package collections.list;

import java.util.Stack;

/*
STACK OPERATIONS
* push
* pop
* peek
* search
 */
public class stackClass {

    static void push(Stack stack, int element){
        stack.push(element);
    }

    static Object peek(Stack stack){
        return stack.peek();
    }

    static void pop(Stack stack){
        stack.pop();
    }

    static int search(Stack stack,int element){
        int pos = stack.search(element);
        if(pos!=-1){
            return 1;
        }
        else{
            return -1;
        }
    }

    static void display(Stack stack){
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }



    public static void main(String[] args) {
        // creates an empty stack
        Stack<Integer> sc = new Stack<>();

        push(sc,1);
        push(sc,2);
        push(sc,3);

        System.out.println("Peek operation");
            System.out.println(peek(sc)); // 3

        System.out.println("\nPop operation");
            pop(sc);

        System.out.println("\nSearch operation");
            int result = search(sc,2);
            if(result==1){System.out.println("Element found");}
            else{
                System.out.println("Element not found");
            }

        System.out.println("\nDisplay");
            display(sc); // 1,2






    }


}
