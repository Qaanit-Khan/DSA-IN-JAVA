public class _09_SelectionDecSort {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {2,7,6,3,0,1,4,8};
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int max = Integer.MIN_VALUE;
            int maxdix = 0;
            for(int j = i; j<n; j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxdix = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxdix];
            arr[maxdix] = temp;
        }
        print(arr);
    }
}
