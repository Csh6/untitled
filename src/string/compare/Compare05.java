package string.compare;

public class Compare05 {
    public static final String A;
    public static  final String B;

    static {
        A="ab";
        B="cd";
    }

    public static void main(String[] args) {
        String s = A+B;
        String t = "abcd";
        if (s == t){
            System.out.println("s等于t，它们是同一个对象");
        }else {
            System.out.println("s不等于t，它们不是同一个对象");
        }
    }
}
