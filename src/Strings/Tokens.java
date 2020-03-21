package Strings;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-string-tokens/problem
public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.length()<400000 && s.length()>0) {
            String[] strings = s.trim().split("[ !,?.\\_'@]+");

            System.out.println(strings.length);
            for (String str : strings) {

                System.out.println(str);
            }
        }
        else if(s.length()>400000) {
            return;
        }
        else if (s == null || s.equals("") || s.trim().equals("")) {
            System.out.println(0);
        }
        scan.close();
    }

}
