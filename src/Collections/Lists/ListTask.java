package Collections.Lists;

//https://www.hackerrank.com/challenges/java-list/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListTask {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        int firstNumber = Integer.parseInt(bufferedReader.readLine());
        for (String number : bufferedReader.readLine().split(" ")) {
            arrayList.add(Integer.parseInt(number));
        }
        int secondNumber = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < secondNumber; i++) {
            String type = bufferedReader.readLine();
            if (type.equals("Insert")) {
                String[] numbers = bufferedReader.readLine().split(" ");
                int firstIn = Integer.parseInt(numbers[0]);
                int secondIn = Integer.parseInt(numbers[1]);
                arrayList.add(firstIn, secondIn);
            } else if (type.equals("Delete")) {
                int delIn = Integer.parseInt(bufferedReader.readLine());
                arrayList.remove(delIn);
            }
        }
        arrayList.forEach(integer -> System.out.print(integer + " "));
    }
}
