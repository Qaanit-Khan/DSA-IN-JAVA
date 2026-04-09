public class _02_global_variable {
    static int n = 10;
    public static void main(String[] args) {
        Print(1);
    }
    public static void Print(int x){
        if(x > n) return;
        System.out.print(x+" ");
        Print(x+1);
    }
}