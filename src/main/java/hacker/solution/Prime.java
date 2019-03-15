package hacker.solution;

class Prime {
    public void checkPrime(int... values) {
        boolean flag = false;
        for (int value: values) {
            for (int i = 2; i <= value / 2; ++i) {
                if (value % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && value != 1)
                System.out.println(value);
        }
    }
}


