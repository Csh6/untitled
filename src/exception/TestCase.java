package exception;

public class TestCase {
    public static void main(String[] args) {
        try{
            int[] arr ={1,2,3};
            System.out.println(arr[4]);
            String str = null;
            System.out.println(str.equals("hello"));
        }
//        catch (Exception e){
//            System.out.println("能够解决员工的bug");
//        }
        catch (NullPointerException e) {
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("下标越界");
        }

    }
}
