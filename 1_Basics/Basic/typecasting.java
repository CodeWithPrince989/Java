import  java.util.*;

public class typecasting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        int c = (short)a;
        int d = (byte)b;
        System.out.println(c);
        System.out.println(d);

        //type promotion
        char a = 'a';
        char b = 'b';
    }
}
