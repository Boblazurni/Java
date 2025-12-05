package PW5.Task_21;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<String> arrayToList(String[] array) {
        List<String> list = new ArrayList<>();
        for (String item : array) {
            list.add(item);
        }
        return list;
    }
}