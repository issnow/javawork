package exer1.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 21:36
 */
public class InterviewTest {
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(128);
        list.add(3);
        updateList(list);
        System.out.println(list);//[1,2]
    }

    private static void updateList(List list) {
        //list.remove(128);
        list.remove(Integer.valueOf(128));
    }
}
