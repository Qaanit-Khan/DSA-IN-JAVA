import java.util.ArrayList;

public class _01_ArrayListJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr.get(0));
        arr.set(1,100);
        System.out.println(arr.get(1));
        arr.add(550);
        arr.add(0,1);
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
