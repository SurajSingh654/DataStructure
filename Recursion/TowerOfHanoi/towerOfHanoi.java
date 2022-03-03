package TowerOfHanoi;

public class towerOfHanoi {
    public static void hanoiTower(int totalDisks, String src, String helper, String dest) {
        if (totalDisks == 1) {
            System.out.println("transfer disk " + totalDisks + " from " + src + " to " + dest);
            return;
        }
        hanoiTower(totalDisks - 1, src, dest, helper);
        System.out.println("transfer disk " + totalDisks + " from " + src + " to " + dest);
        hanoiTower(totalDisks - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 2;
        hanoiTower(n, "S", "H", "D");

    }
}