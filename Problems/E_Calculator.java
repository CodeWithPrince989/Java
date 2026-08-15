package Problems;

class Calculator{

    int num;
    public int add(int n1, int n2){
        return n1 + n2;
    }

}

public class E_Calculator {
    public static void main(String a[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
