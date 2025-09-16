public class _03_palindrome{
    public static int Palidrome(int n){
        int store = 0;
        while(n>0){
            int last = n%10;
            store = store * 10 + last;
            n = n/10;
        }
        return store;
    }
    public static void main(String args[]){
        int n = 13312;
                if(n == Palidrome(n)){
            System.out.println("This number is palindrome");
        }
        else{
            System.out.println("This number is not palindrome");
        }

    }
}