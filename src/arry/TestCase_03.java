package arry;

public class TestCase_03 {
    public static void main(String[] args) {
        int i = 0;
        int sum1 = 0,sum2 = 0;
        while (i <= 100)
        {
            if (i % 2 == 0){
                i++;
                sum1 += i;
            }else {
                i++;
                sum2 += i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
