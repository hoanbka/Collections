package collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceOfCharCount {

    private static List<Character> readFile(File file) throws IOException {
        List<Character> characterList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            char[] arr = line.toCharArray();

            for (char c : arr) {
                characterList.add(c);
            }
        }
        return characterList;
    }

    public static void countChar(File file) throws IOException {
        List<Character> chars = readFile(file);
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < chars.size(); i++) {
            char key = chars.get(i);
            Integer val = map.get(key);
            if (val != null) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (Character key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\NguyenDinhLong\\IdeaProjects\\Collection\\BufferedWriter.txt");
        try {
            countChar(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}