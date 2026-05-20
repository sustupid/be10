package w2;

public class b2 {
    public static void main(String[] args){
        int[] arr = {3,4,5};

        int min = arr[0];
        int max = arr[0];
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
            sum += arr[i];
        }

            double ave = sum / arr.length;
            double roundAve = Math.round(ave * 100.0) / 100.0;

        System.out.println("minimum: " + min);
        System.out.println("maximum: " + max);
        System.out.println("average: " + roundAve);

    }
}
