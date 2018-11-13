package oo.object;

public class TestCase{
    public static void main(String[] args) {
        Stu s1 = new Stu(1,"jack",20);
        Stu s2 = new Stu(2,"jack",20);

        System.out.println(s1.equals(s2));
    }
}
