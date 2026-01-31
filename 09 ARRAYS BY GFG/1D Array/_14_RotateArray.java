public class _14_RotateArray {

    public static void Reverse(int[] arr,int i,int j){
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]){
        int[] arr = {-1,-100,3,99};
        int d = 3;   
        int n = arr.length;

        d %= n;

        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
