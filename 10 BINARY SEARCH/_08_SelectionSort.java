public class _08_SelectionSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,9,3,0,1};
        int n = arr.length;
        System.out.print("Before Sorting : ");
        print(arr);

        for(int i = 0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        print(arr);
    }
}
