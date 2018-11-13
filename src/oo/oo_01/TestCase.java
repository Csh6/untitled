package oo.oo_01;

import lombok.Data;

@Data
public class TestCase {
    public static void main(String[] args) {

        Person jack = new Person();

        jack.setId("120103199506266666");
        jack.setGender("男");
        jack.setName("jack");
        jack.setTel("13231555678");
        jack.setMarried(false);

        Addr a1 = new Addr("300000","西七道");
        Addr a2 = new Addr("300100","志新公寓");
        Addr[] addrs1 = {a1,a2};

        jack.setAddr(addrs1);
        //System.out.println(jack);

        Person rose = new Person();

        rose.setId("120103199406211234");
        rose.setName("rose");
        rose.setGender("女");
        rose.setTel("15722311234");
        rose.setMarried(false);

        Addr a3 = new Addr("300100","东霸道");
        Addr a4 = new Addr("200000","西七道志新公寓");
        Addr[] addrs2 = {a3,a4};
        rose.setAddr(addrs2);

        rose.setMarried(true);

//        Person lisa = new Person();
//        lisa.setName("lisa");
//        System.out.println(lisa.getGender());

        Person deanna = new Person();
        deanna.setName("deanna");

        Person[] gfs ={rose,deanna};
        jack.setGf(gfs);

        if (jack.isIllegality(rose)){
          jack.setQr(rose);
          rose.setQr(jack);
        }else {
            System.out.println("缘分未到");
        }

    }

}
