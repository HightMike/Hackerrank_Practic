package Preparation.HashMaps;

//https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

import java.util.HashMap;
import java.util.Scanner;

public class HashTablesRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> magazineHashMap = calculateWords(magazine);
        System.out.println(result(note, magazineHashMap));
    }

    private static String result(String[] note, HashMap<String,Integer> magazineHashMap) {
        for(String s:note) {
            if(!magazineHashMap.containsKey(s)) {
                return "No";
            }
            int count = magazineHashMap.get(s)-1;

            if(count==0) {
                magazineHashMap.remove(s);
            } else {
                magazineHashMap.put(s, count);
            }
        }
        return "Yes";
    }

    private static HashMap<String, Integer> calculateWords(String[] array) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str: array) {
            if(hashMap.containsKey(str)) {
                int n = hashMap.get(str)+1;
                hashMap.put(str, n);
            } else {
                hashMap.put(str, 1);
            }
        }
        return hashMap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

}
