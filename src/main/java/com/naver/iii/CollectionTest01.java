package com.naver.iii;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionTest01 {
    public static void main(String[] args) {
        // Generics 를 활용하여 key, value 를 모두 String type 으로 저장
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("s_no", "1");
        map1.put("s_name", "고현영");
        map1.put("kor", "80");
        map1.put("eng", "90");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("s_no","2");
        map2.put("s_name", "한승우");
        map2.put("kor", "81");
        map2.put("eng", "91");

        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("s_no", "3");
        map3.put("s_name", "고동현");
        map3.put("kor", "82");
        map3.put("eng", "92");

        ArrayList<HashMap> list = new ArrayList<HashMap>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        // 아래 두 개의 코드는 완전히 같다.
        for (int i = 0; i < list.size(); i++) {
            HashMap map = list.get(i);
            System.out.println("[학생번호]: " + map.get("s_no"));
            System.out.println("[학생이름]: " + map.get("s_name"));
            System.out.println("[국어점수]: " + map.get("kor"));
            System.out.println("[영어점수]: " + map.get("eng"));
        }

        for (HashMap map : list) {
            System.out.println("[학생번호]: " + map.get("s_no"));
            System.out.println("[학생이름]: " + map.get("s_name"));
            System.out.println("[국어점수]: " + map.get("kor"));
            System.out.println("[영어점수]: " + map.get("eng"));
        }

    }
}
