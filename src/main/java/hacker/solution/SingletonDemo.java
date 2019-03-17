package hacker.solution;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        s1.str = "This is my 1st instance";
        Singleton s2 = Singleton.getSingleInstance();
        System.out.println("s1: " + s1.str);
        System.out.println("s2: " + s2.str);
        s2.str = "This is my 2nd instance";
        System.out.println("s1: " + s1.str);
        System.out.println("s2: " + s2.str);
    }
}