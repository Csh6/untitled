package Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TextCase_01 {
    public static void main(String[] args) {
        //数序不保证
        //不能存放重复内容
        Set<String> set= new HashSet<>();//去重复 把list->set（）
        set.add("w");
        set.add("a");
        set.add("b");
        set.add("d");
        set.add("h");
        set.add("q");
//        set.iterator();

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set);
    }
}
