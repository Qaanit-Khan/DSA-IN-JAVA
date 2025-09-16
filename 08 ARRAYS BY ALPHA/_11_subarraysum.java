public class _11_subarraysum{
    public static void SubSum(int n[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i<n.length; i++){
            for(int j = i; j<n.length; j++){
                currsum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(" "+n[k]);
                    currsum = currsum + n[k];
                }
                System.out.println("");
            }
            System.out.println("The Sum of this array is : "+currsum);
            System.out.println("");
            if(maxsum<currsum){
                maxsum = currsum;
            }
        }
        System.out.println("The largest number is : "+maxsum);
    }
    public static void main(String args[]){
        int n[] = {1,-2,6,-1,3};
        SubSum(n);
    }
}