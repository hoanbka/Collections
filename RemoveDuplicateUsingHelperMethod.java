package generic;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateUsingHelperMethod {
    private static <E> boolean isDuplicate(ArrayList<E> list, E element) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                return false;
            }
        }
        return true;
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> nonDuplicateList = new ArrayList<E>();

        for (E element : list) {
            if (isDuplicate(nonDuplicateList, element)) {
                nonDuplicateList.add(element);
            }
        }
        return nonDuplicateList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i);
        }

        ArrayList<Integer> list = removeDuplicates(arrayList);

        for (int i : list) {
            System.out.println(i);
        }

        ////////////
        String[] str = {"hehe", "haha", "hehe", "hihi", "haha"};
        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList(str));

        ArrayList<String> list2 = removeDuplicates(strings);

        for (String string : list2) {
            System.out.println(string);
        }


    }
}
