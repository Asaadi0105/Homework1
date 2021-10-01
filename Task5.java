package Project3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
/*
Using the scanner asks the user to enter one sentence with three words and print the index number
of each word's last character and then print the sum of each index number that you found.
For Example:
Input:
"Importance of Human" --> it can be any three-word sentence.
Output:
9 --> index number of 'e'
12 --> index number of 'f'
18 --> index number of 'n'
The sum: 39
Description
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one sentence with 3 words: ");

        String text = input.nextLine();

        int word1Index = text.indexOf(' ')-1;
        int word2Index = text.indexOf(' ',text.indexOf(' ')+1)-1;
        int word3Index = text.length()-1;
        char word1LastLetter = text. charAt(word1Index);
        char word2LastLetter = text.charAt(word2Index);
        char word3LastLetter = text.charAt(word3Index);
        System.out.println(word1Index+" ----> Index number of "+word1LastLetter);
        System.out.println(word2Index+" ----> Index of number "+word2LastLetter);
        System.out.println(word3Index+" ----> Index of number "+word3LastLetter);
        System.out.println(word1Index+word2Index+word3Index);


    }
}
