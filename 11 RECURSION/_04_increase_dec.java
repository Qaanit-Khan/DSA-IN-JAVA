
public class _04_increase_dec {
    public static void IncDec(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        IncDec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        IncDec(3);
    }
}
