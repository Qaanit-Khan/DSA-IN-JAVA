public class _05_UsingAdding {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {9,0,-4,5,3,7,1,2};
        int n = arr.length;
        print(arr);
        for(int i = 0;i<n-1;i++){
            int swap = 0;
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        print(arr);
    }
}
