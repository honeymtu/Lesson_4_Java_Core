package Lesson_4_Java_Core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> words = new  ArrayList<>();

        words.add(1);
        words.add(2);
        words.add(3);
        words.add(4);
        words.add(5);
        words.add(6);
        words.add(6);
        words.add(4);
        words.add(2);
        words.add(7);
        words.add(8);
        words.add(9);
        words.add(10);

        System.out.println(words);

        Collections.sort(words);

        System.out.println(words);

        HashMap<String, String> loginPassword = new HashMap<>();
        loginPassword.put("12345L123", "ghytrf12");
        loginPassword.put("12345L", "dfresw12");
        loginPassword.put("987654fgtw", "m,ljgfd5567ygh");
        loginPassword.put("lkjmnb12652", "jhvfg15");



        System.out.println();






    }
}
