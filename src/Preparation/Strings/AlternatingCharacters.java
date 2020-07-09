package Preparation.Strings;

import java.io.IOException;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        String[] strs = s.split("");
        int strLen = strs.length;
        int count = 0;
        for (int i = 1; i < strLen ; i++) {
            if (strs[i-1].equals(strs[i])) {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);
            System.out.println(result);
        }

        scanner.close();
    }

}
