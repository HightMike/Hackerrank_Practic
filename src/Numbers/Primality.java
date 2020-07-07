package Numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Primality {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();

//        BigInteger bigInteger = BigInteger.valueOf(Integer.parseInt(n));
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }

}
