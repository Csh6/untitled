//package shop.customer;
//
//import java.util.Scanner;
//
//public class Customer {
//    private String name;
//    private String address;
//    private String call;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCall() {
//        return call;
//    }
//
//    public void setCall(String call) {
//        this.call = call;
//    }
//
//    public Customer(){
//        super();
//    }
//    public Customer(String name,String address,String call){
//        super();
//        Scanner in = new Scanner(System.in);
//        System.out.println("输入收件人姓名");
//        this.name = in.next();
//        System.out.println("请输入收件人联系方式");
//        this.call = in.next();
//        System.out.println("请输入收件人地址");
//        this.address = in.next();
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Customer{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", address='").append(address).append('\'');
//        sb.append(", call='").append(call).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
//}
