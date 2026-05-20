package w2;

public class primeNumber {
    public static boolean isPrimeNumber(int number){
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0 ) return false;

        return true;
    }

    public static void main(String[] args){
        System.out.println(isPrimeNumber(2));
    }
}
