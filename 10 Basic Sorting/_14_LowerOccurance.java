public class _14_LowerOccurance {
    public static int LowerOcc(int[] arr,int target){
        int i = 0;
        int j = arr.length-1;
        int lowerIndex = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>target){
                j = mid - 1;
            }
            else if(arr[mid]<target){
                i = mid + 1;
            }
            else{ //mid == target
                lowerIndex = mid;
                j = mid - 1;
            }
        }
        return lowerIndex;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,4,6,7,8};
        int target = 2;
        System.out.println(LowerOcc(arr,target));
    }
}
