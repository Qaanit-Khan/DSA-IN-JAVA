public class _18_MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,3};
        int lo = 0;
        int hi = arr.length-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid+1]){
                hi = mid;
            }
            else{
                lo = mid + 1;
            }
           
        }
         System.out.print(arr[lo]);
        
    }
}
