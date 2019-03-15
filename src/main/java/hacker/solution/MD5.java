package hacker.solution;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        try {
            byte[] bytes = s.getBytes("US-ASCII");
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hashBytes = digest.digest(bytes);
            System.out.println(new String(HexBin.encode(hashBytes)).toLowerCase());
        } catch (UnsupportedEncodingException uee) {
            System.out.println("Problem encoding bytes: "+uee.getMessage());
        } catch (NoSuchAlgorithmException nsa) {
            System.out.println("Problem finding hashing algorithm: "+nsa.getMessage());
        }
    }
}
