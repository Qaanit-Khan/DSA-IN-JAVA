public class _06_DecendingBubbleSort {
    public static void Print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,6,8,0,22,4,7,8,9};
        Print(arr);
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Print(arr);
    }
}
