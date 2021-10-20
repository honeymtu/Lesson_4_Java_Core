package Lesson_4_Java_Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    public static void main(String[] args) {
        phones();
    }

    private static void phones() {
        Directory phonebook = new Directory();

        phonebook.add("Ivanov", "89295007020");
        phonebook.add("Ivanov", "89152365878");
        phonebook.add("Petrov", "89259684512");
        phonebook.add("Sidorov", "89562568745");
        phonebook.add("Mishin", "89995682536");
        phonebook.add("Petrov", "89251647326");
        phonebook.add("Cotov", "89781254698");
        phonebook.add("Cotov", "89102003060");
        phonebook.add("Sidorov", "89365898969");

        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Sidorov"));
        System.out.println(phonebook.get("Mishin"));
        System.out.println(phonebook.get("Cotov"));
    }

    static class Directory {
        private Map<String, List<String>> directory_phone = new HashMap<>();
        private List<String> phonebook_list;

        public void add(String surname, String phone_number) {
            if (directory_phone.containsKey(surname)) {
                phonebook_list = directory_phone.get(surname);
                phonebook_list.add(phone_number);
                directory_phone.put(surname, phonebook_list);
            } else {
                phonebook_list = new ArrayList<>();
                phonebook_list.add(phone_number);
                directory_phone.put(surname, phonebook_list);
            }
        }

        public List<String> get(String surname) {
            return directory_phone.get(surname);
        }

    }
}

