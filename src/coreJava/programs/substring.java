package coreJava.programs;// ADOBECODEBANC
// ADOBEBANCCODE

// if ABC in coreJava.programs.substring then
    // length = coreJava.programs.substring's length


public class substring {
    public static void main(String[] args){
        String s1 ="ADOBECODEBANC";
        String s2 ="ADOBEBANCCODE";
        String t = "ABC";
        int count= 0;
        int k = 0;
        int arr[] = new int[s1.length()];

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<t.length();j++){
                if(s1.charAt(i)==t.charAt(j)){
                    System.out.println(s1.charAt(i));
                    count++;
                }
                else{
                    continue;
                }

                }
            arr[k++]=count;
            }
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
        }




    }

