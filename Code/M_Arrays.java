public class M_Arrays {
    public static void main(String[] a) {
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    float avg, sum = 0;
    int length = ages.length;
    for (int age : ages) {
        sum += age;
    }

    // Calculate the average by dividing the sum by the length
    avg = sum / length;

    // Print the average
    System.out.println("The average age is: " + avg);
    }
}
