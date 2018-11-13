package cases.qustion.support;

import lombok.Data;

@Data
public class Option {
    private  char key;
    private  String test;

    public Option(char key,String test){
        this.key = key;
        this.test= test;
    }
}
