public class _09_SearchInarray {
    public static void main(String[] args) {
        int[] arr = {1,343,123,4123,41,32429,2342,1234};
        int target = 4123;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                System.out.println("The Target is found in the index of : "+i);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("The Target is not found");
    }
}
