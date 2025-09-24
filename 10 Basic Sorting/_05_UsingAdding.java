public class _05_UsingAdding {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,-3,6,8};
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int swap = 0;
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        print(arr);

    }
}
