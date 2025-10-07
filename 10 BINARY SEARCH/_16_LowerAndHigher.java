public class _16_LowerAndHigher {
    public static int Lower(int[] arr,int target){
        int i = 0;
        int j = arr.length-1;
        int LowerIndex = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] < target){
                i = mid + 1;
            }
            else if(arr[mid] > target){
                j = mid - 1;
            }
            else{
                LowerIndex = mid;
                j = mid - 1;
            }
        }
        return LowerIndex;
    }
    public static int Higher(int[] arr,int target){
        int i = 0;
        int j = arr.length-1;
        int HigherIndex = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>target){
                j = mid - 1;
            }
            else if(arr[mid] < target){
                i = mid + 1;
            }
            else{
                HigherIndex = mid;
                i = mid + 1;
            }
        }
        return  HigherIndex;
    }
    public static void main(String[] args){
        int[] arr = {0,2,2,3,3,3,5,6,7,8,8,10};
        int target = 3;

        System.out.print(Lower(arr,target)+" ");
        System.out.print(Higher(arr,target));
    }
}
