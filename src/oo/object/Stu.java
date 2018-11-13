package oo.object;

import lombok.Data;

@Data
public class Stu{
    private Integer id;
    private String name;
    private double score;

    public Stu(Integer id,String name,double score){
        this.id=id;
        this.name=name;
        this.score=score;
    }
    @Override
    public boolean equals(Object o){
        Stu s1 = this;
        Stu s2 = (Stu)o;

        if (s1.id == s2.id) return true;
        else return false;
    }
}