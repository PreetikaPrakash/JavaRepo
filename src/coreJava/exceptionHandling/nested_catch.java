package coreJava.exceptionHandling;

public class nested_catch {
    public static void main(String args[]){

        int arr[] = new int[]{10,20,4,0,50};

        try {
            int result = arr[1] / arr[2]; // change 2 to 3
            System.out.println("Result is: " + result);

            try {
                int resulttwo = arr[1] / arr[5];
                System.out.println("Result is: " + resulttwo);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Check array size, try again");
            }
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide it by zero, try again");
        }
        System.out.println("Program Ended");
        }
    }

/*OUTPUT
Result is: 0
Result is: 5
You can't divide it by zero, try again
Result is: 0
Check array size, try again
Check array size, try again
Program Ended
* */