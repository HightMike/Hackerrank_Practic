package Strings;

//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try {
                Pattern patternReg =  Pattern.compile(pattern);
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
                testCases--;
                continue;
            }
            System.out.println("Valid");
            testCases--;

            //Write your code
        }
    }

}
