package sizecalculation;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SizeCalculationUsingQueue {
    private static Queue<File> queue = new LinkedList<>();
    static long size = 0;

    public static long getSize(File dir) {

        for (File file : dir.listFiles()) {
            queue.add(file);
        }

        while (true) {

            ArrayList<File> subFiles = new ArrayList<>();
            Iterator<File> iterator = queue.iterator();

            while (iterator.hasNext()) {

                File file = iterator.next();
                if (file.isFile()) {
                    size = size + file.length();
                    iterator.remove();

                } else {
                    for (File f : file.listFiles()) {
                        subFiles.add(f);
                    }
                    iterator.remove();
                }
            }
            queue.addAll(subFiles);

            if (queue.isEmpty()) {
                break;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        File dir = new File("D:\\java\\TaiLieu\\__MACOSX");

        System.out.println("Total size of directory = " + getSize(dir) + " bytes");
    }
}

