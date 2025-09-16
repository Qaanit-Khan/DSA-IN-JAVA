public class _06_prime{
    public static boolean Prime(int n){
        for(int i = 2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("If true means Prime Or false means Not prime : "+Prime(5));
    }
}