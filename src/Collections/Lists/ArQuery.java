package Collections.Lists;
//https://www.hackerrank.com/challenges/java-arraylist/problem

import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArQuery {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> secondArrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArQuery arQuery = new ArQuery();
        arQuery.addInList(arrayList, bufferedReader);
        arQuery.addInList(secondArrayList, bufferedReader);

        for (ArrayList<Integer> arrayList1 : secondArrayList) {
            if (arrayList1.get(0)<=arrayList.size() &&
                    arrayList1.get(1)<=arrayList.get(arrayList1.get(0)-1).get(0)) {
                System.out.println(arrayList.get(arrayList1.get(0)-1).get(arrayList1.get(1)));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }

    private void addInList (ArrayList<ArrayList<Integer>> arrayList, BufferedReader bufferedReader) throws IOException{
        int firstNumber = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < firstNumber; i++) {
            ArrayList<Integer> curArrayList = new ArrayList<>();
            for (String line : bufferedReader.readLine().split(" ")) {
                curArrayList.add(Integer.parseInt(line));
            }
            arrayList.add(curArrayList);
        }
    }
}
