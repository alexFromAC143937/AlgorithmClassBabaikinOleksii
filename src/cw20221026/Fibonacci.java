package cw20221026;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(5));
        /*        System.out.println(fibNaive(100));*/
        System.out.println(fibBetter(5));
        int [] array = {3,12,10,11};
        int n = 0;
        System.out.println(sum(n,array));
        System.out.println(sumI(n,array));

    }

    public static long fibNaive(int n){ //
        if(n<=1){
            return n;
        }else{
            return fibNaive(n-1)+fibNaive(n-2);
        }
    }

    public static long fibBetter(int n){ //5
        long [] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static int sum(int n, int[] array){
        if(n==(array.length-1)){
            return array[n];
        }

        //array[n] = 3; 3+12 = 15;
        return array[n] + sum(n+1,array);
    }

    public static int sumI(int n, int[] array){
        int ssumm = 0;
        for (int i = n ; i  <array.length; i++)  ssumm += array[i];
        return ssumm;
    }



}
