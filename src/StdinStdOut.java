import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StdinStdOut {

    public static void main(String[] args) throws Exception{
        //Scanner scan = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        double d = Double.parseDouble(bufferedReader.readLine());
        String s = bufferedReader.readLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }


}
