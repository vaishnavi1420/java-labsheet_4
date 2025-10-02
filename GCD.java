class GCD {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 56 and 98: " + gcd(56, 98));
    }
}
