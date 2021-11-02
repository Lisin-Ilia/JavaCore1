package HW4;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicates {

    public static HashMap<String, Integer> duplicates(String arr[]) {

        HashSet<String> wordSet = new HashSet<>();
        HashMap<String, Integer> duplicateWordSet = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(wordSet.add(arr[i]))
                duplicateWordSet.put(arr[i],1);
            else
                duplicateWordSet.put(arr[i], (Integer)(duplicateWordSet.get(arr[i])) +1);
        }
        return duplicateWordSet;
    }

}
