public class _22_Positive_negative {
    public static int Count(int[] arr){
        int lo = 0;
        int n = arr.length;
        int hi = n-1;
        int NegCount = 0;
        int PosCount = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=0){
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        NegCount = lo;
        lo = 0;
        hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<=0){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        PosCount = n - lo;
        if(NegCount>PosCount){
            return NegCount;
        }
        return PosCount;

    }
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,0,0,1,2,3,4};
        System.out.println(Count(arr));

    }
}
