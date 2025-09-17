public class _10_secondlargest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,40,50,50};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int j = 0;j<arr.length;j++){

            if(arr[j] > smax && arr[j] != max){
                smax = arr[j];
            }
        }
        System.out.println(smax);
    }
}
