public class _03_run_output{
    public static void Update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void Print(int marks[]){
        for(int j = 0; j<marks.length; j++){
            System.out.print(" "+marks[j]);
        }
        System.out.println("");
    }
    public static void main(String args[]){
        int marks[] = {88,89,99};
        Update(marks);
        Print(marks);
    }
}