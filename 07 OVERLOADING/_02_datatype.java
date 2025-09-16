public class _02_datatype{

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String args[]){

        System.out.println("The sum of 2 numbers but differetn data type int   : "+sum(5,5));
        System.out.println("The sum of 2 numbers but different data type float : "+sum(5.0f,5.0f));
    }
}