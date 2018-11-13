package Collection.list.arraylist;

import java.util.ArrayList;
import java.util.Date;

public class TestCase_01 {
    public static void main(String[] args) {
        ArrayList c = new ArrayList();

        c.add(1);
        c.add("1");
        c.add("-");
        c.add(new Date());
        c.add(0,"hello");
        System.out.println(c);
        System.out.println(c.contains(0));
    }
}
