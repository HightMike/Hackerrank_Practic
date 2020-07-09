package Preparation.Strings;

import java.io.IOException;
import java.util.Scanner;

public class MakeAnagram {

    static int makeAnagram(String a, String b) {

        String[] aAr = a.split("");
        for (int i = 0; i < aAr.length; i++) {
            String str = aAr[i];
            if (b.contains(str)) {
                b = b.substring(0, b.indexOf(str)) + b.substring(b.indexOf(str)+1) ;
                aAr[i] = "";
            }
        }
        int count = 0;
        for (int i = 0; i <aAr.length ; i++) {
            if(!aAr[i].equals("")) {
                count++;
            }
        }
        return count + b.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println(res);

        scanner.close();
    }

}
