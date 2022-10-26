package cw20221026;

public class Tasks {

    public static void main(String[] args) {

        System.out.println(getNumberInInt(12341234, 1) );
        System.out.println(getNumberInInt(123417234, 7) );

        System.out.println(sumNumbers(1111019) );
        System.out.println(sumNumbers(999) );

    }

    public static int getNumberInInt(int initInt, int foundedNum){
        int number = 0;
        if(initInt > 0){
            number = getNumberInInt(initInt/10, foundedNum);
        }else{
            return 0;
        }
        return number + ((initInt % 10) == foundedNum ? 1 : 0);
    }

    public static int sumNumbers(int initInt){
        int number = 0;
        if(initInt > 0){
            number = sumNumbers(initInt/10);
        }else{
            return 0;
        }
        return number + initInt % 10;
    }


}
