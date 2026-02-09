public class vowels {
    public static void main(String[] args) {
        String s = "my name is qaanit khan and i am pursuing artificial intelligence and data science";
        int ans = 0;
        String king = "slskdfs";
        for(int i = 0;i<s.length();i++){
            char z = s.charAt(i);
            if(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u'){
                ans++;
                king.charAt(i) = s.charAt(i);
            }
        }
        System.out.println(ans);
        System.out.println(king);
    }
}
