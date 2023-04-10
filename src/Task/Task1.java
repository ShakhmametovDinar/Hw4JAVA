package Task;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Task1 {

    static LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
    public static void reverseLinkList(){
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
    }

}
