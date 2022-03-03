package Numbers;

class printNumbers {
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        } else {
            printNumber(n - 1);
            System.out.println(n); // Print 1-5
            // System.out.println(n); // Print 5-1
            // printNumber(n - 1);
        }
    }

    public static void main(String args[]) {
        int n = 5;
        printNumber(n);

    }
}