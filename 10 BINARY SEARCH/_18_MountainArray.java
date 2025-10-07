public class _18_MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,3,0,-2,-4};
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
