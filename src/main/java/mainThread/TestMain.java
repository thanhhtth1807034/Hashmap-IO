package mainThread;

import entity.Person;


import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class TestMain {
    public static void main(String[] args) {
//        HashSet<Person> setPerson = new HashSet<Person>();
//        setPerson.add(new Person(1,"thanh"));
//        for (Person person:setPerson) {
//            System.out.println(person.getName() +"  "+ person.getId());
//        }

        Queue<String> queue = new ArrayDeque<>();
        queue.add("todo1");
        queue.add("todo2");
        queue.add("todo3");
        queue.add("todo4");
        for (String s:queue) {
            System.out.println(s);
        }
        System.out.println(queue.poll());
        for (String s:queue) {
            System.out.println(s);
        }
        
    }
}
