package hacker.solution;

class Prime {
    void checkPrime(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    boolean isPrime(int n){
        if (n == 2)
            return true;
        if (n < 2 || n % 2 == 0)
            return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}


