public class _08_binTOdec{
    public static int BitoDec(int n){
        int store = 0;
        int i = 0;
        while(n>0){
            int last = n%10; // last digit 
            int power = (int)Math.pow(2,i); // multiply by 10 
            store = store + (last*power); // store
            n = n/10; // remove last digit
            i++;
        }
        return store;
    }
    public static void main(String args[]){
        System.out.print(BitoDec(101));
    }
}