package string.compare;

public class Compare04 {
    public static final String A="ab";//常量A
    public static final String B = "cd";
    public static void main(String[] args) {
        String s = A.concat(B);
        String t = "abcd";
        if (s == t){
            System.out.println("s等于t，它们是同一个对象");
        }else {
            System.out.println("s不等于t，它们不是同一个对象");
        }
    }
}
