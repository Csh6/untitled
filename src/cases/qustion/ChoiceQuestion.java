package cases.qustion;

import cases.qustion.support.Option;
import lombok.Data;

@Data
public class ChoiceQuestion extends Question{

    protected Option[] options;

    public  ChoiceQuestion(String title,Option[] options){
        super(title);
        this.options =options;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
