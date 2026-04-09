public class _01_basic {
    public static void recursion(int n){
        if(n == 0) return;
        // recursion(n-1);
        System.out.println(n);
        recursion(n-1);
    }
    public static void main(String[] args) {
        recursion(20);
    }
}