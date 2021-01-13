package com.naver.iii;

import java.util.ArrayList;

class Employee {
    private int emp_no;
    private String emp_name;
    private String rank;
    private ArrayList<Family> family;

    public ArrayList<Family> getFamily() {
        return family;
    }

    public void setFamily(ArrayList<Family> family) {
        this.family = family;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}