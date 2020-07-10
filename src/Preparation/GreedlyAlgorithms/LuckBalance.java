package Preparation.GreedlyAlgorithms;

//https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms

import java.io.IOException;
import java.util.*;

public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {

        List<Integer> firstIntegers = new ArrayList<>();
        int maxValue = 0;
        for (int[] contest : contests) {
            if (contest[1] == 1) {
                firstIntegers.add(contest[0]);
            } else {
                maxValue += contest[0];
            }
        }

        Comparator<Integer> comparator = (integer, t1) -> t1-integer;
        firstIntegers.sort(comparator);
        for (int i = 0; i < firstIntegers.size(); i++) {
            if (i<k) {
                maxValue+=firstIntegers.get(i);
            } else {
                maxValue-=firstIntegers.get(i);
            }
        }
        return maxValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        System.out.println(result);

        scanner.close();
    }

}
