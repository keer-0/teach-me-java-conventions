package powerpackage;

public class Math {
    public static int power(int base, int exponent) {
        int p = 1;
        for (int i = 0; i<exponent; i++) {
            p *= base;
        }
        return p;
    }
}
