public class G_Java_Strings {
    public static void main(String[] a) {
        String greeting = "Hello MyFriend, How Was Your Day!";
        System.out.println(greeting + greeting.length());

        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase()); // Outputs "hello world"

        String firstName = "Prince";
        String lastName = "Singh";
        System.out.println(firstName + " " + lastName);

        String[] cars = {
            "Volvo",
            "BMW",
            "Ford",
            "Mazda"
        };

        for(String car : cars) {
            System.out.println(car);
        }
    }
}
