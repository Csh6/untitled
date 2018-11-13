package arry;

public class TestCase_04 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        for (;i <= 100;i++){
            if (i % 10 == 3){
                return;
            }else {
                i++;
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
