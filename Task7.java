package Project3;
import java.util.Locale;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
/*
Using
scanner enter String (any two words) value
with spaces in the beginning and at the end. In this input, the second word is not starting with the upper case,
using string methods change the letter with upper case and print it
Example 1:
Please enter the String with the following format “ word “
Natural black
The output is:
Natural Black
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String with the following format: ");
        String text = input.nextLine();

        text = text.trim();
        int a = text.indexOf(" ")+1;
        String b = ""+text.charAt(a+1);
        String d = b.toUpperCase();
        String c =text.replace(b,d);

        System.out.println(c);
   // Natural black


    }
}
