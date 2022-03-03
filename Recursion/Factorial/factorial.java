package Factorial;

public class factorial {
    private static int factorialValue;

    public static int printFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return factorialValue += n * printFactorial(n - 1);

    }

    public static void main(String args[]) {
        System.out.println(printFactorial(5));
    }
}
