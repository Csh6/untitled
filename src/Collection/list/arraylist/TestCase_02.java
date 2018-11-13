package Collection.list.arraylist;

import oo.object.Stu;

import java.util.ArrayList;

public class TestCase_02 {
    public static void main(String[] args) {

        ArrayList stus = new ArrayList();

        Stu s1 = new Stu(1,"jack",20);
        Stu s2 = new Stu(2,"tom",20);

        stus.add(s1);
        stus.add(s2);

        Stu s3 = new Stu(1, "tom",30);
        System.out.println(stus.contains(s3));
    }
}
