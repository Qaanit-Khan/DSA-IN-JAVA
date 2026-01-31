public class _02_BubbleSorting {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {2,-1,4,2,6,3,1};
        int n = arr.length;
        print(arr);

        for(int j = 0;j<n;j++){
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);


    }
}
