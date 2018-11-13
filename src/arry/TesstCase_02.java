package arry;

public class TesstCase_02 {
    public static void main(String[] args) {
        int size = 9;
        for (int i = 1;i<=size;i++){
            for (int j= 0;j <= i;j++){
                System.out.print(i+"*"+"j"+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
