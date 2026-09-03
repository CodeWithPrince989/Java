import java.util.*;

public class reverse_number {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();
        int rev = 0;
        int digit;
        while(nums>0){
            digit = nums % 10;
            rev = (rev * 10) + digit;
            nums /= 10;
        }
        System.out.print(rev);
    }
}