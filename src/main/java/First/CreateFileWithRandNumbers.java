package First;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CreateFileWithRandNumbers {
    public static List<Integer> ls = new ArrayList<>();
    public static List<Integer> biggestValues = new ArrayList<>(3);
    public static void main(String[] args) {
        String st;
        File source = new File("D:\\intellij\\test.txt");
        try
        {
        BufferedReader fileReader = new BufferedReader(new FileReader(source));
        while ((st = fileReader.readLine()) != null) {
            ls.add(Integer.valueOf(st));
            //System.out.println(st);
        }}
        catch (IOException ex)
        {
            System.out.println(ex);
        }

        getNumbers();
        System.out.println(biggestValues);
        biggestValues.clear();
        }

    public static List<Integer> getNumbers() {

        for (int a = 2; a >= 0; a = a - 1) {
            int biggest = Collections.max(CreateFileWithRandNumbers.ls);
            int biggestIndex = ls.indexOf(biggest);
            ls.remove(biggestIndex);
            biggestValues.add(biggest);
        }
        return biggestValues;
    }

}