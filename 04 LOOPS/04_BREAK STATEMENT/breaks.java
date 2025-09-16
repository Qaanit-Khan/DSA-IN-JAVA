public class breaks{
    public static void main(String args[]){
        for(int i = 1; i<=10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println("\nOut of the loop due to break statement =  5");
    }
}