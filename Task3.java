package Project3;
/*
Please use method chaining for the following Strings. Methods are provided next to the String.
String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’, concat with ’s’, starts with ‘C’
 */

public class Task3 {
    public static void main(String[] args) {
        String text = "   Snicker   ";
        String text2 = "Cookie";

        System.out.println(text.trim().toUpperCase().substring(1, 4).charAt(2));
        System.out.println(text2.toLowerCase().replace("o", "u").concat("S").startsWith("C"));
    }
}
