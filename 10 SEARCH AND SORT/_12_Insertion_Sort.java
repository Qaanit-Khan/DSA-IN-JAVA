public class _12_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,-1};
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j] ){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
