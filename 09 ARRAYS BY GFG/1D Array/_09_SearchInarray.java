public class _09_SearchInarray {
    public static void main(String[] args) {
        int[] arr = {1,343,123,4123,41,32429,2342,1234};
        int target = 4123;
        boolean found = false;
        for(int i = 1;i<arr.length;i++) {
            if(arr[i] == target){
                target = i;
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("The Index of the array is : "+target);
        }
        else{
            System.out.println("Target missing from the array");
        }
    }
}
