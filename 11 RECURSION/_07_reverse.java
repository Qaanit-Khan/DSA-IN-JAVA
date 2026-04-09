public class _07_reverse {

    public static int Reverse(int n, int rev){
        if(n == 0) return rev;

        int last = n % 10;
        return Reverse(n / 10, rev * 10 + last);
    }

    public static void main(String[] args) {
        int num = 7178;
        System.out.println(Reverse(num, 0));
    }
}