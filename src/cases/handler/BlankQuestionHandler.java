//package cases.handler;
//
//import cases.answer.Answer;
//import cases.answer.BlankAnswer;
//import cases.check.Check;
//import cases.constant.Constant;
//import cases.qustion.BlankQuestion;
//import cases.qustion.Question;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class BlankQuestionHandler implements Check {
//
//    @Override
//    public int check(Question question, Answer answer){
//        BlankQuestion blankQuestion = (BlankQuestion)question;
//        BlankAnswer blankAnswer =(BlankAnswer)answer;
//
//        int score = 0;
//        if (blankAnswer.getContents() != null && blankAnswer.getContents().length >0){
//            for (int i = 0; i < blankAnswer.getContents().length; i++) {
//                if (Array.contains(blankQuestion.getAnswer(),blankAnswer.getContents()[i])){
//                    score += Constant.BLANK_SCORE;
//                }
//            }
//        }
//        return  score;
//    }
//}
