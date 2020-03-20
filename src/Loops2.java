import java.util.*;

public class Loops2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            lists.add(numbers(a,b,n));
        }
        in.close();

        for (ArrayList<Integer> arrayList : lists) {
            for (int i=0;i<arrayList.size();i++) {
                if (i==arrayList.size()-1) {
                    System.out.print(arrayList.get(i)+ "\n");
                } else {
                    System.out.print(arrayList.get(i)+ " ");
                }
            }
        }
    }

    private static List<ArrayList<Integer>> lists = new ArrayList<>();
    private static ArrayList<Integer> numbers(Integer a, Integer b, Integer n) {

        ArrayList<Integer> list = new ArrayList<>();
        double k =0;
        for (int i=0; i<=n-1; i++) {
            if (i==0) {
                double findDouble = a + (Math.pow(2, i) * b);
                k=k+findDouble;
            } else {
                double findDouble = (Math.pow(2, i) * b);
                k=k+findDouble;
            }
            list.add((int)k);
        }
        return list;
    }
}
