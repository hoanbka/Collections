package generic;

import java.util.*;

public class RemoveDuplicateUsingHashmap {


    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> nonDuplicateList = new ArrayList<E>();

        Map<E,Integer > map= new HashMap<E, Integer>();
        for (E element: list) {
            map.put(element,0);
        }

        Iterator<E> it= (Iterator<E>) map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            nonDuplicateList.add((E) pair.getKey());
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

        String[] str = {"hehe", "haha", "hehe", "hihi", "haha"};
        ArrayList<String> strings= new ArrayList<>();
        strings.addAll(Arrays.asList(str));

        ArrayList<String> list2 = removeDuplicates(strings);

        for (String string: list2) {
            System.out.println(string);
        }


    }
}
