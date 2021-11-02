package HW4;

import java.util.*;

import static HW4.Duplicates.duplicates;

public class Main {

    public static void main(String[] args) {

        /*1*/
        String[] duplicateArray = {"Apple","Pear", "Peach","Apple","Plum", "Apple","Orange", "Banana", "Apple", "Pear" };

        System.out.println( "Уникальные значения \n" + duplicates(duplicateArray) + "\n");

        /*2*/
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+7-953-123-45-67");
        phonebook.add("Иванов", "+7-953-123-45-68");
        phonebook.add("Иванов", "+7-953-123-45-69");
        phonebook.add("Иванов", "+7-953-123-46-70");
        phonebook.add("Петров", "+7-953-123-45-71");
        phonebook.add("Петров", "+7-953-123-45-71");
        phonebook.add("Петров", "+7-953-123-45-72");
        phonebook.add("Сидоров", "+7-953-123-45-73");
        phonebook.add("Сидоров", "+7-953-123-45-74");

        System.out.println("Телефонный справочник");
        phonebook.get();
        }

}

