package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("11", "Priti", "24", "IT"));
        list.add(new Student("13", "Rani", "30", "Law"));
        list.add(new Student("10", "Munni", "33", "CA"));
        list.add(new Student("1", "Aashish", "34", "IT"));
        list.add(new Student("66", "Shital", "33", "Commerce"));

//        Collections.sort(list, new SortByAge());
        Collections.sort(list, new SortByDept());

        System.out.println(list);
    }
}