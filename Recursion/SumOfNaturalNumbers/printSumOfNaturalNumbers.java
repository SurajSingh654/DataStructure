package SumOfNaturalNumbers;

public class printSumOfNaturalNumbers {
    private static int sumOfNumbers(int n) {
        if (n == 0)

            return 0;
        else {
            return n + sumOfNumbers(n - 1);
        }
    }

    public static void main(String args[]) {
        sumOfNumbers(10);
    }
}
