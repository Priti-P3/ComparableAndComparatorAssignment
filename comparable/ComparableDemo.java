package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee("11","Priti",24,"IT"));
        list.add(new Employee("13","Rani",30,"Law"));
        list.add(new Employee("10","Munni",33,"CA"));
        list.add(new Employee("1","Aashish",34,"IT"));
        list.add(new Employee("66","Shital",33,"Commerce"));

        Collections.sort(list);
        System.out.println(list);




    }
}
