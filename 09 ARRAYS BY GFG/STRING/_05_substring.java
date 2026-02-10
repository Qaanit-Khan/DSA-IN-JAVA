public class _05_substring {
    public static void main(String[] args) {
        String n1 = "Qaanit";
        for(int i = 0;i<n1.length();i++){
            for(int j = i;j<n1.length();j++){
            System.out.println(n1.substring(i, j+1));
        }
        }
    }
}
