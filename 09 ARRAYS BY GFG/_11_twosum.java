public class _11_twosum {
    public static void main(String[] args) {
        int[] arr = {1,5,8,-3};
        int target = 6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
