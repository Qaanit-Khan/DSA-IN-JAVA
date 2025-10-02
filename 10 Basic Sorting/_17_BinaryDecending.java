public class _17_BinaryDecending {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,0};
        int target = 3;
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > target){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
    }
}
