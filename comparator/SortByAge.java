package Comparator;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge().compareTo(s2.getAge());
    }
}
