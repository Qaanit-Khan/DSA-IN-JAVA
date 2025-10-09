public class _18_MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2};
        int i = 1;
        int j = arr.length-2;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
    }
}
