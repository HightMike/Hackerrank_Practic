package Preparation.Sorting;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int sum=0;
        int count = 0;
        for (int price : prices) {
            sum = sum + price;
            count++;
            if (sum > k) {
                count--;
                return count;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        System.out.println(result);

        scanner.close();
    }

}
