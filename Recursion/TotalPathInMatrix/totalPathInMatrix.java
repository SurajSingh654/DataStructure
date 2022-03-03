package TotalPathInMatrix;

public class totalPathInMatrix {
    public static int sumAllPathInMatrix(int row, int col, int currentX, int currentY) {
        if (currentX == row || currentY == col) {
            return 0;
        }
        if (currentX == row - 1 && currentY == col - 1) {
            return 1;
        }
        int downPaths = sumAllPathInMatrix(row, col, currentX + 1, currentY);
        int rightPaths = sumAllPathInMatrix(row, col, currentX, currentY + 1);
        return downPaths + rightPaths;
    }

    public static void main(String args[]) {
        System.out.println(sumAllPathInMatrix(3, 3, 0, 0));
    }
}
