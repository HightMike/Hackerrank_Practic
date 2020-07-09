package Preparation.Strings;

//String name = "Строк";
//
//Вывести строку name в виде:
//Строк
// трок
//  рок
//   ок
//    К

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ladder {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        //choose variant
        runLadder(Variant.BUILDER, name);
    }

    public static void runLadder(Variant variant, String name) {
        if (variant == Variant.BUILDER) {
            StringBuilder stringBuilder = new StringBuilder(name);
            System.out.println(stringBuilder);
            for (int i = 0; i < stringBuilder.length(); i++) {
                stringBuilder.setCharAt(i,' ');
                System.out.println(stringBuilder);
            }
        } else if (variant==Variant.STR) {
            String temp = " ";
            for (int i = 0; i < name.length(); i++) {
                if(i>0) {
                    System.out.println(temp+name.substring(i));
                    temp = temp.concat(" ");
                } else  {
                    System.out.println(name.substring(i));
                }
            }
        }
    }


}
