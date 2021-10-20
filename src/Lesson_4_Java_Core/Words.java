package Lesson_4_Java_Core;

import java.util.LinkedHashSet;
import java.util.Set;

public class Words {
    public static void main(String args[]) {
        Set<String> set = new LinkedHashSet<>();
        set.add("один");
        set.add("два");
        set.add("три");
        set.add("четыри");
        set.add("три");
        set.add("пять");
        set.add("два");
        set.add("шесть");
        set.add("семь");
        set.add("восемь");
        set.add("один");
        set.add("три");
        set.add("девять");

        System.out.println(set);
    }
}
