//package case02.oo;
//
//import java.util.Date;
//
//public class Test {
//    public static void main(String[] args) {
//        Product p1 = new Product(1,"Java",10);
//        Product p2 = new Product(2,"Linux",20);
//
//        Customer c1 = new Customer();
//        c1.setId(1);
//        c1.setName("jack");
//
//        RecInfo recInfo1 = new RecInfo(1,"志新公寓","jack",true);
//        RecInfo recInfo2 = new RecInfo(2,"西湖","tom",false);
//        RecInfo[] infos ={recInfo1,recInfo2};
//
//        c1.setRecInfos(infos);
//
//        Item item1 = new Item(p1,2);
//        Item item2 = new Item(p2,6);
//        Item item3 = new Item(p2,2);
//
//        BuyCart cart =new BuyCart();
//
//        cart.addItem(item1);
//        cart.addItem(item2);
//        cart.addItem(item3);
//
//        //查看购物车
//        cart.showBuyCart();
//
//        //生成订单
//        System.out.println("下单。。。。。");
//
//        long time = System.currentTimeMillis();//获取当前的时间 long 值
//        Date now = new Date();//获取当前时间
//
//        Orders orders = new Orders(String.valueOf(time),now,recInfo1,cart);
//        System.out.println(orders.toString());
//    }
//}
