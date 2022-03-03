package Fibonacci;

public class printFibonacci {
    public static int printFibonacciNumber(int n) {
        if (n <= 1)
            return n;
        return printFibonacciNumber(n - 1) + printFibonacciNumber(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(printFibonacciNumber(3));
    }
}
