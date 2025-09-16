public class unary{
    public static void main(String args[]){
        int a = 10;
        int b = ++a;
        System.out.println("Pre Increament before ++a : "+a);
        System.out.println("Pre Increament after ++a  : "+b);

        int c = a++;   // post-increment: c gets a (11), then a becomes 12
System.out.println("Post Increment value of c : " + c);
System.out.println("Value of a after post-increment : " + a);



    }
}