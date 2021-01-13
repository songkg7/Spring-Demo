package com.naver.iii;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest02 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setS_no(1);
        stu1.setS_name("고현영");
        stu1.setKor(80);
        stu1.setEng(90);

        Student stu2 = new Student();
        stu2.setS_no(2);
        stu2.setS_name("한승우");
        stu2.setKor(81);
        stu2.setEng(91);

        Student stu3 = new Student();
        stu3.setS_no(3);
        stu3.setS_name("고동현");
        stu3.setKor(82);
        stu3.setEng(92);

        // [ArrayList] 객체를 생성하고 메모리 주소를 list 에 저장하기
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (Student stu : list) {
            System.out.println("학생번호 : " + stu.getS_no());
            System.out.println("학생이름 : " + stu.getS_name());
            System.out.println("국어 : " + stu.getKor());
            System.out.println("영어 : " + stu.getEng());
        }

    }
}
