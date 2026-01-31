public class _13_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        for(int i = 0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        // int start = 0;
        // int end = arr.length -1 ;
        // while(start<=end){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
