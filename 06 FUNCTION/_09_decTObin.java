public class _09_decTObin{
    public static int Decimal(int n){

        int store = 0;
        int i = 0;
        while(n>0){
            int reminder = n%2;
            store = store + (reminder * (int)Math.pow(10,i));
            i++;
            n = n/2;
        }
        return store;


    }
    public static void main(String args[]){
        System.out.println(Decimal(4));
    }
}