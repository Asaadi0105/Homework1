package Project3;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
/*
Using a
scanner enter three different ingredients for the product
on the same line. Then ask the user to enter any int number. Change the first letter of the ingredients
starting from the entered number. (Ingredients should start with different letters. Please read the example carefully)
Example 1:
Please enter three ingredients with spaces:
Milk Peanuts Butter
Please enter the int number:
5
The output is:
5ilk 6eanuts 7utter
Example 2:
Please enter three ingredients with spaces:
Sugar Cocoa Oil
Please enter the int number:
3
The output is:
3ugar 4ocoa 5il
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three ingredients with spaces");
        String ingredients = input.nextLine().trim();
        System.out.println("Please enter an integer number");
        int num1 = input.nextInt();
        int num2 = num1 + 1;
        int num3 = num1 + 2;

        String sNum1 = "" + num1;
        String sNum2 = "" + num2;
        String sNum3 = "" + num3;

        int index1 = 0;  // 0
        String letter1 = "" + ingredients.charAt(0);

        int index2 = ingredients.indexOf(" ") + 1; // 5
        String letter2 = "" + ingredients.charAt(index2);

        int index3 = ingredients.indexOf(" ", index2) + 1; // 13
        String letter3 = "" + ingredients.charAt(index3);

        String result = ingredients.replace(letter1, sNum1);
        result = result.replace(letter2, sNum2);
        result = result.replace(letter3, sNum3);
        System.out.println(result);
        System.out.println();
    }
}
