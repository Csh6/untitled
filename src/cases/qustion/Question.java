package cases.qustion;

import lombok.Data;

@Data

public abstract class Question {
    protected  String title;
    public Question(String title){
        this.title = title;
    }
}
