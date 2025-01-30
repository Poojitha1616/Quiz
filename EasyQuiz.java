import java.util.Scanner;

public class EasyQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Quiz");

        System.out.println("Question 1: What is the color of the sky?");
        System.out.println("A. Blue");
        System.out.println("B. Red");
        System.out.println("C. Green");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("A")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is Blue.");
        }

        System.out.println("Question 2: What is the sum of 2 + 2?");
        System.out.println("A. 3");
        System.out.println("B. 4");
        System.out.println("C. 5");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("B")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is 4.");
        }

        System.out.println("Your final score is " + score + " / 2");
    }
}


