public class _08_reverse {
    public static void main(String[] args) {
        System.out.println(Reverse(277, 0));
    }   
    public static int  Reverse(int n,int r){
        if(n == 0){
            return r;
        }
        return Reverse(n/10, r*10 + n%10);
    } 
}
