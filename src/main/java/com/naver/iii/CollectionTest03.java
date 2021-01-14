package com.naver.iii;

import java.util.ArrayList;

public class CollectionTest03 {
    public static void main(String[] args) {
        Family family1 = new Family();
        family1.setEmp_no(1);
        family1.setRelation("배우자");
        family1.setF_name("설현");
        family1.setBirth_year(1990);

        Family family2 = new Family();
        family2.setEmp_no(2);
        family2.setRelation("배우자");
        family2.setF_name("수지");
        family2.setBirth_year(1997);

        ArrayList<Family> listFamily1 = new ArrayList<>();
        listFamily1.add(family1);

        ArrayList<Family> listFamily2 = new ArrayList<>();
        listFamily2.add(family2);

        Employee emp1 = new Employee();
        emp1.setEmp_no(1);
        emp1.setEmp_name("황보민");
        emp1.setRank("사장");
        emp1.setFamily(listFamily1);

        Employee emp2 = new Employee();
        emp2.setEmp_no(2);
        emp2.setEmp_name("박인선");
        emp2.setRank("전무");
        emp2.setFamily(listFamily2);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);

        for (Employee emp : list) {
            System.out.println("직원번호 : " + emp.getEmp_no());
            System.out.println("직원이름 : " + emp.getEmp_name());
            System.out.println("직원직책 : " + emp.getRank());

            ArrayList<Family> familyList = emp.getFamily();
            for(int i = 0; i < familyList.size(); i++) {
                Family f = familyList.get(i);
                System.out.println("직원번호 : " + f.getEmp_no());
                System.out.println("관계 : " + f.getRelation());
                System.out.println("이름 : " + f.getF_name());
                System.out.println("생일 : " + f.getBirth_year());
            }
        }
    }
}
