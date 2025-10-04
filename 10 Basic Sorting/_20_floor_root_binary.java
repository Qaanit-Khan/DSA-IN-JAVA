public class _20_floor_root_binary {
    public static void main(String[] args) {
        int n = 26;
        int i = 1;
        int j = n;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(mid*mid == n){
                System.out.println(mid);
                break;
            }
            else if(mid*mid>n){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        System.out.println(j);
    }
}
