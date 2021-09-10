package Project3;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

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
