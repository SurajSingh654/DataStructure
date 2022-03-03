package PlaceTiles;

public class placeTiles {
    public static int placeTile(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // Vertically
        int verticlePlacements = placeTile(n - m, m);
        // Horizontally
        int horizontalPlacements = placeTile(n - 1, m);
        return verticlePlacements + horizontalPlacements;
    }

    public static void main(String args[]) {
        System.out.println(placeTile(4, 3));
    }
}
