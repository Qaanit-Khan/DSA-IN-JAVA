public class _07_countPrime{
    public static boolean prime(int n){
        for(int i = 2;i<=n-1;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void count_prime(int n){
        for(int i = 1;i<=n;i++){
            if(prime(i)){
                System.out.print(" "+i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        count_prime(n);
    }

}