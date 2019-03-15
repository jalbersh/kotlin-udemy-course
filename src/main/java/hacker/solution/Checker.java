package hacker.solution;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
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
    public int compare(Player o1, Player o2) {
        if (o1.score == o2.score) {
            if (o1.name.equals(o2.name)) return 0;
            return stringCompare(o1.name,o2.name);
        } else return o2.score - o1.score;
    }
}
