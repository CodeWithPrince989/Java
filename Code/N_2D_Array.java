public class N_2D_Array {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        // Populate the 2D array with random numbers (0–9)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        // Print the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }






    }
}