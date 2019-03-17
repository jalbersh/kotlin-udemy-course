package hacker.solution;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@SuppressWarnings("unchecked")
public class SetDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
//Write your code here
        Set set =  new HashSet();
        for (int i =0 ; i<t ;i++){
            set.add(pair_left[i]+"_"+pair_right[i]);
            System.out.println(set.size());
        }
    }

}
