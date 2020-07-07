package Collections.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetTask {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> hashSet = new HashSet<>();
        int count = 0;
        for (int n = 0; n < t; n++) {
            String str = pair_left[n].concat(",").concat(pair_right[n]);
            if (!hashSet.contains(str)) {
                count ++;
            }
            hashSet.add(str);
            System.out.println(count);
        }
    }
}
