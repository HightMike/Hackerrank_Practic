package Strings;


//https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(new StringBuilder(A).reverse().toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */

    }

}
