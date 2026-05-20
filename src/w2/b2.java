package w2;

import java.math.BigDecimal;

public class b2 {
    public static void main(String[] args){
        int[] arr = {2,2,1};

        int min = arr[0];
        int max = arr[0];

        int ave = 0;

        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }

        System.out.println("minimum: " + min);
        System.out.println("maximum: " + max);
        System.out.println("average: " + ave);







    }
}
