package cw20221102;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
         int[] arr = {11, 22, 44};

        System.out.println(getIndex(arr, 22));
    }

    public static int getIndex(int[] arr, int number){
        int i = 0;
        int j = arr.length - 1;

        while(i<=j ){
            int k = i+(j-i)/2;
            if(arr[k]< number){
                i = k+1;
            }else if(arr[k] > number){
                j = k-1;
            }else{
                return k;
            }
        }
        return -1;
    }
}