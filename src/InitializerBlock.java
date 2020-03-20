import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InitializerBlock {

    private static int B;
    private static int H;
    private static boolean flag;
    static {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
                flag = true;
                B = Integer.parseInt(bufferedReader.readLine());
                H = Integer.parseInt(bufferedReader.readLine());
                if(B <= 0 || H<=0) {
                    flag=false;
                    System.out.println("java.lang.Exception: Breadth and height must be positive");
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
