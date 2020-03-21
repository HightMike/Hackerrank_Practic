package Strings;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        String lex = A.compareTo(B)>0? "Yes" : "No";

        System.out.println(A.length()+B.length() +"\n" +
                    lex + "\n" +
                        (A.substring(0,1).toUpperCase()+A.substring(1)).concat(" "+B.substring(0,1).toUpperCase()+B.substring(1))

                );

        /* Enter your code here. Print output to STDOUT. */

    }

}
