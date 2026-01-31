public class news {
    public static void main(String[] args) {
        int n = 5; // size

        // upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i); // print number
            }
            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
