package string.common;

public class TwstCase_String {
    public static void main(String[] args) {
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i <2000 ; i++) {
            str.concat("a");
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}
