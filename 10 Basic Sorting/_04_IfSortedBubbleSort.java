public class _04_IfSortedBubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        print(arr);
        boolean isSorted = true;
        for(int i = 0;i<n-1;i++){
            for(int k = 0;k<n-1;k++){
                if(arr[k]>arr[k+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted == true){
                System.out.println("GOOD BYE");
                break;
            }
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);


    }
}

