
public class E_Type_Casting {
    public static void main(String[] args) {
        // Widening Casting (automatic) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        int a = 9;
        double b = a;   // Automatic casting: int to double

        System.out.println(a);
        System.out.println(b);

        // Narrowing Casting (manual) - converting a larger type to a smaller type size
        // double -> float -> long -> int -> char -> short -> byte

        double c = 9.78d;
        int d = (int) c;    // Manual casting: double to int
        System.out.println(c);
        System.out.println(d);
    }
}




