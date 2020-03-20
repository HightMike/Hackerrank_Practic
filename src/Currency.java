import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html
//about format currency

public class Currency {

    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
        double payment = Double.parseDouble(bufferedReader.readLine());
//        scanner.close();

        NumberFormat fr = NumberFormat.getIntegerInstance(Locale.FRENCH);
        Integer france = (Integer) fr.parse(String.valueOf(payment));

        NumberFormat ch = NumberFormat.getInstance(Locale.CHINA);
        String china = String.valueOf(ch.parse(String.valueOf(payment)));

        NumberFormat in = NumberFormat.getInstance(Locale.ENGLISH);
        String india = String.valueOf(in.parse(String.valueOf(payment)));

        NumberFormat u = NumberFormat.getInstance(Locale.US);
        String us = String.valueOf(u.parse(String.valueOf(payment)));



        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
