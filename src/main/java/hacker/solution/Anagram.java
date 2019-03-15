package hacker.solution;

import java.util.*;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) return false;
        if (a.equals(b)) return true;
//        if (a.equals(reverse(b))) return true;
        Set<Character> aset = new HashSet<Character>();
        char[] aletters = a.toCharArray();
        char[] bletters = b.toCharArray();
        Set<Character> bset = new HashSet<Character>();
        for (int i = 0; i < a.length(); i++) {
            aset.add(new Character(aletters[i]));
            bset.add(new Character(bletters[i]));
        }
        if (aset.size() != bset.size()) return false;
        Map<Character, Integer> amap = new HashMap<Character, Integer>();
        Map<Character, Integer> bmap = new HashMap<Character, Integer>();
        Iterator ait = aset.iterator();
        while (ait.hasNext()) {
            Character c = (Character) ait.next();
            int origLength = a.length();
            int newLength = a.replaceAll(c.toString(), "").length();
            int occurences = origLength - newLength;
            amap.put(c, occurences);
        }
        Iterator bit = bset.iterator();
        while (bit.hasNext()) {
            Character c = (Character) bit.next();
            int origLength = b.length();
            int newLength = b.replaceAll(c.toString(), "").length();
            int occurences = origLength - newLength;
            bmap.put(c, occurences);
        }
        if (amap.size() != bmap.size()) return false;
        for (int i = 0; i < amap.size(); i++) {
            Character c = (Character) aset.toArray()[i];
            int aOccurs = 0;
            int bOccurs = 0;
            try {
                aOccurs = amap.get(c);
                bOccurs = bmap.get(c);
            } catch (Exception e) {
            }
            if (aOccurs != bOccurs) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
