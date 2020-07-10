package Preparation.GreedlyAlgorithms;

import java.io.IOException;
import java.util.*;

public class GreedyFlorist {

    static int getMinimumCost(int k, int[] c) {

        int sum = 0;

        List<Integer> list = new ArrayList<>();
        for (int value : c) {
            list.add(value);
        }
        list.sort(Collections.reverseOrder());
        int len = list.size()/k;
        if (list.size()%k!=0) {
           len++;
        }
        for (int n = 1; n <= len; n++) {
            int temp =(n-1)*k;
            if(n==len && list.size()%k!=0) {
                k=list.size()%k;
            }
            for (int i = temp; i < temp+k; i++) {
                sum+=(n) * list.get(i);
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        System.out.println(minimumCost);

        scanner.close();
    }

}
