package Preparation.HashMaps;

import java.io.IOException;
import java.util.*;

public class TwoStrings {



    static String twoStrings(String s1, String s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("")));
        Iterator<String> i = set1.iterator();
        while (i.hasNext()) {
            if(s2.contains(i.next())) {
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        scanner.close();
    }

}
