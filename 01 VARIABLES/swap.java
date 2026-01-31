public class swap{
    public static void main(String args[]){
        int a = 10;
        int b = 5;

        int temp = a; // temp = 10
        a = b;        // a = 5;
        b = temp;     // b = 10;
        System.out.println(a);
        System.out.println(b);
    }
}