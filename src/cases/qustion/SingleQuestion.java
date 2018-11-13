package cases.qustion;

import cases.qustion.support.Option;
import lombok.Data;

@Data
public class SingleQuestion  extends ChoiceQuestion{
    public char answer;

    public SingleQuestion(String title, Option[] options,char answer){
        super(title,options);
        this.answer = answer;
    }
}
