public class _10_subarrays{
    public static void SubArrays(int n[]){
        for(int i = 0; i<n.length; i++){
            for(int j = i; j<n.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(" "+n[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n[] = {10,20,30,40,50,60,70,80};
        SubArrays(n);
    }
}