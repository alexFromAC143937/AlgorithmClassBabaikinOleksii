package cw20221019;

import java.util.Arrays;

public class Class2 {

 public static void main(String[] args) {

     int[] array1 = {5, 2, 7, 7, 5};
     System.out.println("1) Array: " + Arrays.toString(array1));
     doubleInt(array1);

     String[] array2 = { "bcd", "abd", "jude", "bcd"};
     System.out.println("2) Array: " + Arrays.toString(array2));
     doubleString(array2);

   int[] array3 = {-1, 4, 0, 2, 7, -3};
   System.out.println("3) Array: " + Arrays.toString(array3));
   System.out.println("3) second min O(n) : " + secondMin(array3));
 }



 public static void doubleInt(int[] array){
     for(int i = 0; i < array.length-1; i++){
         for(int j = i+1; j < array.length; j++){
             if(array[i] == array[j]){
                 System.out.println("1) Double elenment: " + array[i]);
                 break;
             }
         }
     }
 }

    public static void doubleString(String[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i].equals(array[j])){
                    System.out.println("2) Double elenment: " + array[i]);
                    break;
                }
            }
        }
    }

 public static int secondMin(int[] array ) {
     int min0 = array[0];
     int min1 = array[0];

  for (int i = 1; i < array.length; i++) {
   if(min0 >array[i]){
      min1 = min0;
      min0 = array[i];
   }
  }
  return min1;
 }

}


