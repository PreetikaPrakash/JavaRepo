package coreJava;

public class volume {

    public static void main(String[] args){
        int start[] = {10,5,15,18,30};
        int duration[] = {30,12,20,35,35};
        int volume[] = {50,51,20,25,10};

        int totaltime[] = new int[duration.length];
        for (int i=0;i<duration.length;i++){
            totaltime[i]=start[i]+duration[i];
        }

        int val[] = new int[duration.length];
        for (int i=0;i<duration.length;i++){
            boolean flag = true;
            for(int j=1;j<duration.length;j++){
            if(totaltime[i]==start[j]){
                flag = false;
            }
        }
            if(flag==true){
                val[i]=volume[i];
            }
        }

    }
}
