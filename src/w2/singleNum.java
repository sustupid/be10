package w2;

public class singleNum {
    public static int singleNumber(int[] nums){

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++){
                if (nums[i] == nums [i+1])
                    count++;
                else return nums[i];
            }
        if (count >= 2) return 0;

        }

    public static void main(String[] args){
    int[] arr = {2,2,1};
    System.out.println(singleNumber(arr));
    }
}
