package w2;

public class palindrome {
    public static boolean isPalindrome(int[] numbers){
        for(int i = 0; i < numbers.length / 2; i++){
            if (numbers[i] != numbers[numbers.length - 1 - i])
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[][] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            if (!isPalindrome(numbers[i])) return false; // AI IDK
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] numbers2D = {{1,2,1},{1,2,2,1}};
        int[] numbers = {1,0};
        System.out.println(isPalindrome(numbers2D));
        System.out.println(isPalindrome(numbers));
    }
}
