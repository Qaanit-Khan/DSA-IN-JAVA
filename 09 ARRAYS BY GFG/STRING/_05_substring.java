public class _05_substring {
    public static void main(String[] args) {
        String n1 = "Qaanit";
        int n = n1.length();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<=n;j++){
                System.out.println(n1.substring(i,j));
            }
        }
    }
}
