package hacker.solution;


public class Printer {
    public <T> void printArray(T[] array) {
        for (T element: array){
            System.out.println(element);
        }
    }
}
