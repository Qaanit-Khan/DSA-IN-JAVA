public class _09_hcf {
    public static int HCF(int a,int b){
        return helper(Math.min(a, b),Math.max(a, b));
    }
    public static int helper(int a,int b){
        if(a == 0) return b;
        return helper(b%a,a);
    }
    public static void main(String[] args) {
        System.out.println(HCF(2, 10));
    }    
}
