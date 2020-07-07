package Collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/phone-book/problem

public class MapTask {

    public static void main(String []args)
    {
        Map<String, Integer> hashMap = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            hashMap.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(hashMap.get(s)==null) {
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+hashMap.get(s));
            }
        }
    }

}
