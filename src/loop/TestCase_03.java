package loop;

public class TestCase_03 {
    public static void main(String[] args) {
        String[] infos = {"java","c","sql","db2"};

//        int i = 0;
//        for ( i = 0; i < infos.length; i++) {
//            System.out.println("element:"+i+",values:"+infos[i]);
//            i++;
//        }
//        System.out.println(i);

        for (int j = infos.length-1; j >= 0; j--) {
            System.out.println("element :"+ j +",values:"+infos[j]);
        }
    }
}
