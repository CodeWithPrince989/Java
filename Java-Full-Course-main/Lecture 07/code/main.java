import java.util.Scanner; // 1. Import the Scanner class

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // Answer of Question 1

        // System.out.println("Enter a Number to Check: ");
        // System.out.println("Enter 2 Number to Check: ");
        // int num = scanner.nextInt();
        // int num2 = scanner.nextInt();


        // if(num>0){
        //     System.out.println("The Entered Number is Positive");
        // }else {
        //     System.out.println("The Entered Number is Not Positive");
        // }


        // Answer of Question 2
        // if(num%2==0){
        //     System.out.println("The Number is Even");
        // }
        // else if(num%2!=0){
        //     System.out.println("The Number is Odd");
        // }else{
        //     System.out.println("You Entered a Wrong Number");
        // }


        // Answer of Question 3
        // if(num>=18){
        //     System.out.println("Congratulation! You are Eligible");
        // }else{
        //     System.out.println("You are Not Eligible");
        // }
        
        // Answer of Question 4
        // if(num>num2){
        //     System.out.println(num + " is Greater");
        // }else{
        //     System.out.println(num2 + " is Greater");
        // }


        // Answer of Question 5
        // System.out.println("Enter Temperature in Your City");
        // int temp = scanner.nextInt();

        // if(temp>=25){
        //     System.out.println("Hot");
        // }else if(temp<10){
        //     System.out.println("Very Cold");
        // }else if(temp>=10 && temp<25 ){
        //     System.out.println("Moderate Temperature");
        // }else{
        //     System.out.println("Enter Wrong Number");
        // }


        // Answer 6
        // System.out.println("Enter Your Marks: ");
        // int marks = scanner.nextInt();
        // if(marks>=90){
        //     System.out.println("Grade A");
        // }
        // else if(marks>=75){
        //     System.out.println("Grade B");
        // }
        // else if(marks>=60){
        //     System.out.println("Grade C");
        // }
        // else if(marks>=40){
        //     System.out.println("Grade D");
        // }
        // else if(marks<40){
        //     System.out.println("Fail");
        // }


        // Answer 7
        // System.out.println("Enter 3 Numbers to get greatest: ");
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();
        // if(a>b && a>c){
        //     System.out.println(a + " is Greater");  
        // }else if(b>c && b>a){
        //     System.out.println(b + " is Greater");
        // }else{
        //     System.out.println(c + " is Greater");
        // }


        // Answer 8
        // System.out.println("Enter a Number: ");
        // int num = scanner.nextInt();
        // if(num==0){
            //     System.out.println("Number is Zero");
            // }else if(num<0){
                //     System.out.println("Number is Negative");
                // }else{
                    //     System.out.println("Number is Positive");
                    // }
                    
                    
                    // Answer 9 
                    // System.out.println("Enter a Number Betwwen 1 to 7:");
                    // int num = scanner.nextInt();
                    // switch (num) {
                    //     case 1:
                    //         System.out.println("Monday");
                    //         break;
                    //     case 2:
                    //         System.out.println("Tuesday");
                    //         break;
                    //     case 3:
                    //         System.out.println("Wednesday");
                    //         break;
                    //     case 4:
                    //         System.out.println("Thursday");
                    //         break;
                    //     case 5:
                    //         System.out.println("Friday");
                    //         break;
                    //     case 6:
                    //         System.out.println("Saturday");
                    //         break;
                    //     case 7:
                    //         System.out.println("Sunday");
                    //         break;
                    //     default:
                    //         System.out.println("Invalid Number");
                    //         break;
                    // }


                    // Answer 10
                   System.out.println("Enter 2 Numbers:");
                    int num = scanner.nextInt();
                    int num2 = scanner.nextInt();

                    System.out.println("Enter Operation to perform(+, -, *, /, %): ");
                    String operation = scanner.next();

                        if (operation.equals("+")) {
                            System.out.println(num + num2);
                        } 
                        
                        else if (operation.equals("-")) {
                            System.out.println(num - num2);
                        }
                        else if (operation.equals("*")) {
                            System.out.println(num * num2);
                        }
                        else if (operation.equals("/")) {
                            System.out.println(num / num2);
                        }
                        else if (operation.equals("%")) {
                            System.out.println(num % num2);
                        }else {
                            System.out.println("Invalid or unhandled operation!");
                        }
        
        scanner.close(); 

    }
}
