package Project3;
import java.util.Scanner;
/*
Write the program
to get the string value from the specified position. First, ask the user to enter one String value.
Then ask the user to enter starting number and ending number.
After that, print the value between the given starting and ending numbers.
(Note: since the user does not know the java, the user starts counting from 1, and the ending number will be included)
Example:            Please enter the String value:
                    Definition of Science
                    Please enter the starting number:
                    2
                    Please enter the ending number
                    5
                    The output is:
                    efin
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String value: ");
        String firstScanner = scanner.nextLine();
        System.out.println("Please enter the starting number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter the ending number: ");
        int secondNum = scanner.nextInt();
        String between = firstScanner.substring(firstNum-1, secondNum);
        System.out.println(between);



    }
}
