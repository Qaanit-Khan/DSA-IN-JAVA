public class hallow_right{
    public static void rect(int rows,int cols){
        for(int k = 1;k<=rows;k++){
            for(int m = 1;m<=rows-k;m++){
                System.out.print(" ");
            }
            for(int l = 1;l<=cols;l++){
                if(k == 1 || l==1 || k==rows || l==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        rect(4,4);
    }
}
