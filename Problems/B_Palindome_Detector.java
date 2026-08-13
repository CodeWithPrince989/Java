package Problems;

import java.util.Scanner;

public class B_Palindome_Detector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Word: ");
        String word = scanner.next(); // Read string instead of int

        // Convert to lowercase to make search case-insensitive (e.g., "Radar" -> "radar")
        String cleanWord = word.toLowerCase();
        
        boolean isPalindrome = true;
        int left = 0;
        int right = cleanWord.length() - 1;

        // Check characters from outside moving inward
        while (left < right) {
            if (cleanWord.charAt(left) != cleanWord.charAt(right)) {
                isPalindrome = false;
                break; // Mismatch found, no need to check further
            }
            left++;
            right--;
        }

        // Print output once after verification
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is Not a Palindrome.");
        }

        scanner.close();
    }
}