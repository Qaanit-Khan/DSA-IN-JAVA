public class _07_binarysearch{
    public static int BinarySearch(int n[],int keys){
        int start = 0;
        int end = n.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(n[mid] == keys){
                return mid;
            }
            if(n[mid] > keys){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n[] = {1,33,44,55,99,993,4444};
        int keys = 44;
        int ans = BinarySearch(n,keys);
        System.out.println("The Index of "+keys+" is : "+ans);
    }
}