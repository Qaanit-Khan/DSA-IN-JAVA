public class _12_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,9,5,-2};
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
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
