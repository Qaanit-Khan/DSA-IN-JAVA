public class _10_secondlargest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,40,60,70,50,70,80};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int len = arr.length;
        for(int i = 0;i<len;i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0;i<len;i++) {
            if(arr[i]>smax && smax<max){
                smax = arr[i];
            }
        }
        System.out.println("The Second Largest number in the array : "+smax);
    }
}
