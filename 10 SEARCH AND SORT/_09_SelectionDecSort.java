public class _09_SelectionDecSort {
    public static void Print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,22,88,1,44,3,99,58,13,23,90,45};
        int n = arr.length;
        Print(arr);
        System.out.println();
        for(int i = 0;i<n;i++){
            int max = Integer.MIN_VALUE;
            int maxix = 0;
            for(int j = i;j<n;j++){
                if(max<arr[j]){
                    max = arr[j];
                    maxix  = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxix];
            arr[maxix] = temp;
        }
        Print(arr);
    }
}
