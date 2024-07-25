package org.example;
import java.util.Arrays;

public class Students {
    String name;
    int studentID;
    int korean;
    int english;
    int math;
    int average;

    public Students(String name, int studentID, int korean, int english, int math){
        this.name = name;
        this.studentID = studentID;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.average = (this.korean+this.english+this.math)/3;
    }

    public void result(){
        System.out.println("이름:"+name+"\t"+"학번:"+studentID+"\t"+"국어:"+korean+"\t"+"영어:"+english+"\t"+"수학:"+math);
        System.out.println("평균 : "+average+"점");
    }


}