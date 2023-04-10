package Task;

import java.util.Arrays;
import java.util.LinkedList;

public class Task2 {
    static LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
    public static void enqueue(int i){
        list2.addLast(i);
        System.out.println(list2);
    }
    public static void dequeue(){
        System.out.println(list2.get(0));
        list2.remove(0);
        System.out.println(list2);
    }
    public static void first(){
        System.out.println(list2.get(0));
    }
    public static void run(){
        enqueue(6);
        dequeue();
        first();
    }
}
