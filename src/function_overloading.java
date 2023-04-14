public class function_overloading {
    // function name is same but,
        // parameters are different
        // datatype of parameters are different
        // if return type is different doesnt matter, it is not overloading then

    // parameters are different
    public int func1(int x){
        System.out.println("Inside x parameter function 1 "+x);
        return 0;
    }
    public int func1(int x, int y){
        System.out.println("Inside x,y parameter function 1"+x+y);
        return 0;
    }

    // Output
    /*
    Inside x parameter function 1 100
    Inside x,y paramter function 1 100200
    */

    // datatype of parameters are different
    public int func1(float x){
        System.out.println("Inside datatype x "+x);
        return 0;
    }
    public int func1(int x, float y){
        System.out.println("Inside datatype x ,y"+x+y);
        return 0;
    }

    // Output
    /*
    Inside datatype x 300.4
    Inside datatype x ,y 300400.5
    */

    // if return type is different doesnt matter, it is not overloading then
    /*public float func1(float x){
        System.out.println("Inside datatype x "+x);
        return 0;
    }
       Above lines give error
     */

    public static void main(String[] args) {
        function_overloading fo = new function_overloading();
        fo.func1(100);//int func1(int x)
        fo.func1(100,200);//int func1(int x, int y)
        fo.func1(300.4f);//int func1(float x)
        fo.func1(300,400.5f);//int func1(int x, float y)
    }

}
