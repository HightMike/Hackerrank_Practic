import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EndOfFile {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            System.out.println(i+" "+line);
            i++;
        }
    }

}
