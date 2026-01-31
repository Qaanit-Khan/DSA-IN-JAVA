public class _15_MissingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,10,9};//arr ki length hai 1 to n-1 yani (1 to n+1)
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int ArraySum = 0;
        for(int ele : arr){
            ArraySum += ele;
        }   
        int missing = sum - ArraySum;
        System.out.print("The Array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.print("\nThe Missing value in the array is : "+missing);
    }
}
