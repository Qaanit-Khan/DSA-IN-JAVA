public class floyd{
    public static void num(int n){
        int num = 1;
        for(int i = 1;i<=n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        num(4);
        
    }
}