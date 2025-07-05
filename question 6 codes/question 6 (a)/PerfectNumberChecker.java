import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        int number = 0;
        
        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                String input = myNumber.nextLine();
                number = Integer.parseInt(input);
                
                if (number <= 0) {
                    System.out.println("Please enter a positive integer greater than 0.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
            }
        }
        
        //Question 6 (a) (ii)
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }


        //Question 6 (a) (iii)
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        myNumber.close();
    }
}