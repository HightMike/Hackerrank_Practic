package Strings.stringRegex;

//https://www.hackerrank.com/challenges/java-regex/problem

import java.util.Scanner;

public class MainMyRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}
