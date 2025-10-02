public class _15_HigherOccurance {
    public static int HigherOcc(int[] arr,int target){
        int i = 0;
        int j = arr.length-1;
        int hIndex = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] > target){
                j = mid - 1;
            }
            else if(arr[mid] < target){
                i = mid + 1;
            }
            else{
                // mid == target
                hIndex = mid;
                i = mid + 1;
            }
        }
        return hIndex;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,4,4,7,8,9,10,10};
        int target = 4;
        System.out.println(HigherOcc(arr,target));
    }
}
