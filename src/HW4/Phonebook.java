package HW4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    Map<String, ArrayList<String>> abonent =new HashMap<>();

        public void add(String lastName, String number){
            if (abonent.get(lastName) == null) {
                ArrayList<String> numbers = new ArrayList<>();
                numbers.add(number);
                abonent.put(lastName, numbers);
            } else {
                abonent.get(lastName).add(number);
            }
        }

        public void get() {
        abonent.keySet().stream().sorted().forEach(lastName -> {
            System.out.println(lastName + " : " +String.join(" , ", this.get(lastName)));
        });
    }

    public ArrayList<String> get(String lastName) {
        return  abonent.get(lastName);
    }
}
