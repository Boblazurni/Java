package PW5.Task_21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryLister {
    public static void listFirstFive(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.min(5, files.length); i++) {
            result.add(files[i].getName());
        }
        System.out.println(result);
    }
}