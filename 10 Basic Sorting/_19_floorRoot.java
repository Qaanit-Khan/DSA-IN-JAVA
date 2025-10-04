public class _19_floorRoot {
    public static void main(String[] args) {
        int n = 25;
        int root = 0;
        for(int i = 1;i<=n;i++){
            if(i*i > n){
                break;
            }
            root = i;
        }
        System.out.println(root);
    }
}
