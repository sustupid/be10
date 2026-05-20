package w2;

public class singleNum {
    public static int singleNumber(int[] nums){

        int num = nums[0];
        for (int i = 0; i < nums.length - 1; i++){
                if (nums[i] == 1) return 1;
                else if (num != nums[i]) return num;
            }
            return 0;
        }

    public static void main(String[] args){
    int[] arr = {2,2,1};
    System.out.println(singleNumber(arr));
    }
}
