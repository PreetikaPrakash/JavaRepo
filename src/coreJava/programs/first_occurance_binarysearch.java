package coreJava.programs;

public class first_occurance_binarysearch {

    public static int binary(int[] arr,int key){
        int start = 0;
        int end = arr.length-1;
        int first_occurence = -1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                first_occurence = mid;
                end = mid-1;

            }
            else if(key>arr[mid]){
                start= mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return first_occurence;
    }

    public static void main(String[] args){
        int arr[]= {10,30,30,30,30,35,35,40,40,40,45,50,50,60,70};
        System.out.println(binary(arr,30));
        System.out.println(binary(arr,10));


    }
}
