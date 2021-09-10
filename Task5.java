package Project3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one sentence with 3 words: ");

        String text = input.nextLine();
//        System.out.println(text);

        int word1Index = text.indexOf(' ')-1;
        //System.out.println(word1Index);
        int word2Index = text.indexOf(' ',text.indexOf(' ')+1)-1;
        //System.out.println(word2Index);
        int word3Index = text.length()-1;
       // System.out.println(word3Index);
        char word1LastLetter = text. charAt(word1Index);
        char word2LastLetter = text.charAt(word2Index);
        char word3LastLetter = text.charAt(word3Index);
        System.out.println(word1Index+" ----> Index number of "+word1LastLetter);
        System.out.println(word2Index+" ----> Index of number "+word2LastLetter);
        System.out.println(word3Index+" ----> Index of number "+word3LastLetter);
        System.out.println(word1Index+word2Index+word3Index);


    }
}
