package coreJava.varags;

/*  OBJECTIVE -
        Maximum Number using Varags
*/
public class Max_Numbers_Varags {

    int returnMax(int ...num){
        // No value present inside num array
        if(num.length==0){
            return Integer.MIN_VALUE;
        }
        // num array only has 1 value
        else if(num.length==1){
            return num[0];
        }
        else{
            int m=num[0];
            for(int i=1;i<=num.length-1;i++){
                if(m<num[i]) {
                    m = num[i];
                }
                continue;
            }
            return m;
        }
    }

    public static void main(String ...args){
        Max_Numbers_Varags mnv=new Max_Numbers_Varags();
        int max = mnv.returnMax(10,60,40,90,50,70);
        System.out.printf("Maximum number is %d",max);
    }

}


