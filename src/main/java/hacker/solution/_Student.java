package hacker.solution;

import java.util.Comparator;

public class _Student implements Comparator<_Student> {
    private int id;
    private String fname;
    private double cgpa;
    public _Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int stringCompare(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
    }
    @Override
    public int compare(_Student o1, _Student o2) {
        if (o1.getCgpa() == o2.getCgpa()) {
            if (o1.getFname().equals(o2.getFname())) {
                return o2.getId()-o1.getId();
            }
            return stringCompare(o1.getFname(),o2.getFname());
        } else return (int)(o2.getCgpa() - o1.getCgpa());
    }
}

