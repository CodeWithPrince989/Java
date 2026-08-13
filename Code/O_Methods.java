public class O_Methods {
    static void myMethod() {
        System.out.println("I Just got executed!");
    }

    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] a) {
        myMethod();
        myMethod2("Prince", 22);
        myMethod2("Jenny", 8);
    }


}
