public class _04_compare_tos {
    public static int compare_to(String s1, String s2){
        if(s1 == s2) return 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return (int)s1.charAt(i) - (int)s2.charAt(i);
            }
        }
        if(s1.length() > s2.length()){
            return (int) s1.length()-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        String n1 = "llaan";
        String n2 = "Qaanit";
        System.out.println(compare_to(n1, n2)); 

    }
}
