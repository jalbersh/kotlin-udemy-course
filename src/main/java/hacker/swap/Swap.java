package hacker.swap;

public class Swap {
    class Pair {
        private Integer a;
        private Integer b;

        public Pair(Integer a, Integer b) {
            this.a = a;
            this.b = b;
        }

        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }

        public Integer getB() {
            return b;
        }

        public void setB(Integer b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
    private Pair swap(Integer a, Integer b) {
        Integer temp=0;
        temp = a;
        a = b;
        b = temp;
        return new Pair(a,b);
    }
    public static void main(String[] args)
    {
        Integer a1 = 2;
        Integer b1 = 3;
        Swap s = new Swap();
        Pair p = s.swap(a1,b1);
        System.out.println("after swapping");
        System.out.println("a1="+a1);
        System.out.println("b1="+b1);
        System.out.println("Pair="+p);
    }
}
