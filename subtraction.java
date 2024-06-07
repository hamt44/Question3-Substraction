/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oopexam.subtraction;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author YSJ COMPUTERS
 */
public class subtraction {
 public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number1, number2;
        int correctAnswers = 0;

        // Generate multiple subtraction questions
        for (int i = 0; i < 5; i++) {
            number1 = random.nextInt(10);
            number2 = random.nextInt(10);

            // Ensure number1 >= number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // Prompt the student to answer
            System.out.println("What is " + number1 + " - " + number2 + "?");

            // Get the student's answer
            int answer = scanner.nextInt();

            // Check the student's answer
            if (answer == number1 - number2) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is " + (number1 - number2));
            }
        }

        // Display the number of correct answers
        System.out.println("You got " + correctAnswers + " out of 5 questions correct.");
    }
}