package Preparation.Strings;

import java.io.IOException;
import java.util.Scanner;

public class SpecialString {

    static long substrCount(int n, String s) {
        String[] sAr = s.split("");
        int len = sAr.length;
        int count = 0;
        //Part_1
        for (int i = 1; i < len ; i++) {
            int insideCount = 0;
            while (sAr[i-1].equals(sAr[i])) {
                insideCount++;
                i++;
                if(i==len) {
                    break;
                }
            }
            count = count + (insideCount+1)*insideCount/2;
        }
        //Part_2
        for (int i = 1; i < len-1; i++) {
            if((sAr[i-1]+sAr[i]).equals(sAr[i+1]+sAr[i]) && !(sAr[i].equals(sAr[i+1]))) {
                String temp = sAr[i-1];
                int r = 1;
                while ((sAr[i]+sAr[i+r]).equals((sAr[i]+sAr[i-r])) && temp.equals(sAr[i+r])) {
                    count++;
                    r++;
                    if ((i+r)==len||(i-r)<0) {
                        break;
                    }
                }
            }
        }
        return count+n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        System.out.println(result);

        scanner.close();
    }

}
