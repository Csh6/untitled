//package shop.commodity;
//
//public class Commodity {
//    private String id;
//    private String name;
//    private double price;
//    private Integer count;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.naeme = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }
//
//
//    public Commodity(String id,String name,double price){
//        super();
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return  true;
//        }
//        if (obj == null)
//        {
//            return false;
//        }
//        if (getClass() != obj.getClass()){
//            return false;
//        }
//        Commodity cmd = (Commodity)obj;
//        if (id == null){
//            if (cmd.id != null){
//                return false;
//            }
//        }else if (!id.equals(cmd.id)){
//            return false;
//        }
//        return true;
//    }
//
////    @Override
////    public String toString() {
////        final StringBuffer sb = new StringBuffer("Commodity{");
////        sb.append("id='").append(id).append('\'');
////        sb.append(", name='").append(name).append('\'');
////        sb.append(", price=").append(price);
////        sb.append(", count=").append(count);
////        sb.append('}');
////        return sb.toString();
////    }
//}
