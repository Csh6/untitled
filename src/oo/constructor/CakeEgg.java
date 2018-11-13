package oo.constructor;

public class CakeEgg {
    private int egg;
    private boolean isLa;
    private int jiPai;

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public boolean isLa() {
        return isLa;
    }

    public void setLa(boolean la) {
        isLa = la;
    }

    public int getJiPai() {
        return jiPai;
    }

    public void setJiPai(int jiPai) {
        this.jiPai = jiPai;
    }

    public  CakeEgg(){

    }
    public CakeEgg(int egg,boolean isLa,int jiPai){
        this.egg=egg;
        this.isLa=isLa;
        this.jiPai=jiPai;
    }
    public CakeEgg(int egg){
        this.egg=egg;
        this.isLa=false;
        this.jiPai=1;
    }
}
