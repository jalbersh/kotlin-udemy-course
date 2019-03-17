package hacker.solution;

class Add {
    public int add(int... values) {
        int sum=0;
        int i=0;
        for (int value: values) {
            if (i > 0) System.out.print("+");
            System.out.print(value);
            sum += value;
            i++;
        }
        System.out.println("="+sum);
        return sum;
    }
}
