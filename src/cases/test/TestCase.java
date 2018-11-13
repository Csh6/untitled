package cases.test;

import cases.qustion.ChoiceQuestion;
import cases.qustion.SingleQuestion;
import cases.qustion.support.Option;

public class TestCase {
    public static void main(String[] args) {
        //构造一个单选题
        //题干
        String t1 = "以下说法错误的是？";
        //单选题的四个选项
        Option so1 = new Option('A',"==可用于基本类型数据的比较");
        Option so2 = new Option('B',"equals() 可用于引用类型数据的比较");
        Option so3 = new Option('C',"intanseOf 可用于判断对象类型");
        Option so4 = new Option('D',"String 是基本数据类型");
        Option[] sOption ={so1,so2,so3,so4};
        //代表 此题的正确答案是D
        char singleAnswer = 'D';

        ChoiceQuestion si = new SingleQuestion(t1,sOption,singleAnswer);
        //第一题构造完成
    }
}
