package Strings;


import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-anagrams/problem

public class Anagram {

    static boolean isAnagram(String a, String b) {

        java.util.List<String> listA = new java.util.ArrayList<>();
        java.util.List<String> listB = new java.util.ArrayList<>();

        java.util.Collections.addAll(listA, a.toLowerCase().split(""));
        java.util.Collections.sort(listA);

        StringBuilder stringBuilderA = new StringBuilder();
        StringBuilder stringBuilderB = new StringBuilder();

        for (String string : listA) {
            stringBuilderA.append(string);
        }

        java.util.Collections.addAll(listB, b.toLowerCase().split(""));
        java.util.Collections.sort(listB);

        for (String string : listB) {
            stringBuilderB.append(string);
        }
        return stringBuilderA.toString().equals(stringBuilderB.toString());

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}