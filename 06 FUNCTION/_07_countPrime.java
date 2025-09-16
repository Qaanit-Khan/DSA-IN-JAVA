public class _07_countPrime{
    public static boolean Prime(int n){
        for(int i = 2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void CountPrime(int n){
        for(int i = 2;i<=n;i++){
            if(Prime(i)){
                System.out.print(" "+i);
            }
            
        }
        
    }
    public static void main(String args[]){
        CountPrime(20);
    }
}