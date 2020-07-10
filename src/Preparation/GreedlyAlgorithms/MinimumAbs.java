package Preparation.GreedlyAlgorithms;

//https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbs {

    static int minimumAbsoluteDifference(int[] arr) {

        int len = arr.length;
        Arrays.sort(arr);
        int min = Math.abs(arr[0]-arr[1]);
        //Compare just a nearby pair.
        for (int n = 1; n < len-1; n++) {
            int temp = Math.abs(arr[n] - arr[n+1]);
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        System.out.println(result);

        scanner.close();
    }

}
