package Project3;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 String words: ");
        String firstInput = input.nextLine();
        String secondInput = input.nextLine();
        String thirdInput = input.nextLine();

        String firstLetter = firstInput.substring(0);
        String secondLetter = secondInput.substring(0);
        String thirdLetter = thirdInput.substring(0);


        boolean length = firstInput.length() == secondInput.length() && secondInput.length() == thirdInput.length();
        boolean hasJava = firstInput.toUpperCase().contains("JAVA") && secondInput.toUpperCase().contains("JAVA") &&
                thirdInput.toUpperCase().contains("JAVA");
        boolean startUpperCase = firstInput.startsWith(firstLetter) && secondInput.startsWith(secondLetter) &&
                thirdInput.startsWith(thirdLetter);

        if (length && hasJava && startUpperCase) {
            System.out.println(length && hasJava && startUpperCase);
        } else {
            System.out.println(length && hasJava && startUpperCase);
        }

    }
}

