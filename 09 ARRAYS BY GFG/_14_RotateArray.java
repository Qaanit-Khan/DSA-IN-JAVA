public class _14_RotateArray {
    // Function to reverse a part of the array between indices i and j
    public static void Reverse(int[] arr,int i,int j){
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int d = 2;   // Rotate array by 2 positions
        int n = arr.length;

        d %= n;  // In case d > n, make sure d stays within bounds

        // Step 1: Reverse the first 'd' elements
        // Example: [1,2,3,4,5,6,7,8,9] -> [2,1,3,4,5,6,7,8,9]
        Reverse(arr,0,d-1);

        // Step 2: Reverse the remaining (n-d) elements
        // Example: [2,1,3,4,5,6,7,8,9] -> [2,1,9,8,7,6,5,4,3]
        Reverse(arr,d,n-1);

        // Step 3: Reverse the entire array
        // Example: [2,1,9,8,7,6,5,4,3] -> [3,4,5,6,7,8,9,1,2]
        Reverse(arr,0,n-1);

        // Final Output after left rotation by 2: 3 4 5 6 7 8 9 1 2
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
