public class _01_parameters{

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){

        System.out.println("The sum of 2 numbers : "+sum(5,5));
        System.out.println("The sum of 3 numbers : "+sum(5,5,5));
    }
}