//package cases.handler;
//
//import cases.answer.Answer;
//import cases.answer.ChoiceAnswer;
//import cases.check.Check;
//import cases.qustion.ChoiceQuestion;
//import cases.qustion.MultiQuestion;
//import cases.qustion.Question;
//import cases.qustion.SingleQuestion;
//import org.apache.commons.lang3.ArrayUtils;
//
//public class ChoiceQuestionHandler implements Check {
//    @Override
//    public  int check(Question question, Answer answer){
//        ChoiceAnswer choiceAnswer = (ChoiceAnswer)answer;
//
//        boolean flag = false;
//
//        if (question instanceof SingleQuestion){
//            SingleQuestion single =(SingleQuestion)question;
//            flag = single.getAnswer() == choiceAnswer.getChoice()[0];
//        }else if (question instanceof MultiQuestion){
//            MultiQuestion multi =(MultiQuestion)question;
//            if (choiceAnswer.getChoice() !=null && choiceAnswer.getChoice().length == multi.getAnswer().length){
//                for (int i = 0; i <multi.getAnswer().length ; i++) {
//                    flag = ArrayUtils.contains(choiceAnswer.getChoice(),utils.g);
//            }
//        }
//    }
//}
