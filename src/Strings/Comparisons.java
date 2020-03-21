package Strings;

//https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.*;

public class Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
//        List<String> list = new ArrayList<>();
//        for (int i=0; i<s.length()-(k-1); i++) {
//            list.add(s.substring(i, i+(k)));
//        }
//        Collections.sort(list);
//        smallest=s.substring(0,k);
//        largest=s.substring(0,k);
        SortedSet<String> set = new TreeSet<>();

        for (int i=0;i<s.length()-(k-1); i++) {
            String curString = s.substring(i,i+k);
            set.add(curString);
        }
        smallest = set.first();
        largest = set.last();


//        for (int i=0; i<s.length()-(k-1); i++) {
//
//            String curString = s.substring(i,i+k);
//
//            if (smallest.compareToIgnoreCase(curString)>0) {
//                smallest = curString;
//            }
//            if(largest.compareToIgnoreCase(curString)<0) {
//                largest = curString;
//            }
//        }
//        smallest = list.get(0);
//        largest = list.get(list.size()-1);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
