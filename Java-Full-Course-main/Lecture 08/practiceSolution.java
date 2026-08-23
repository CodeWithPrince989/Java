import java.util.Scanner;

public class practiceSolution {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (num % 2 == 0) {
                    if (j == num / 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // Adds spaces for alignment
                    }
                } else if (num % 2 != 0) {
                    if (j == (num / 2) + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // Adds spaces for alignment
                    }
                }
            }
            System.out.println(); // Correct placement to break line after each row
        }
        
        scanner.close(); // Moved inside the main method
    }
}
