public class multiple_catch {
    public static void main(String args[]){

        int arr[] = new int[]{10,20,4,0,50};

        for(int i=0; i<=arr.length;i++){

            try {
                int result = arr[i] / arr[i + 1]; // chance of 2 exceptions here
                System.out.println("Result is: " + result);
            }
            catch (ArithmeticException e){
                System.out.println("You can't divide it by zero, try again");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Check array size, try again");
            }
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