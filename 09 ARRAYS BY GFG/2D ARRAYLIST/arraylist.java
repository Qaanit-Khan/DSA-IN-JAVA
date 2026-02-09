import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<  ArrayList<Integer> > arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10); a.add(4); a.add(5); a.add(10);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(5); b.add(55); b.add(100); b.add(103);
        ArrayList<Integer> c  = new ArrayList<>();
        c.add(9); c.add(18); c.add(27); c.add(36);
        arr.add(a); arr.add(b); arr.add(c);

        System.out.println(arr);

        for(int i = 0;i<arr.size();i++){
            for(int j = 0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }    
}
