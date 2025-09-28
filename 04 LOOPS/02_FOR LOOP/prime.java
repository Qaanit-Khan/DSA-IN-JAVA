public class prime{
    public static boolean Prime_n(int n){
        for(int i = 2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n = 1;
        if(Prime_n(n) == false){
            System.out.print("Not Prime");
        }
        else{
            System.out.println("Yess It's a prime number");
        }
    }
}