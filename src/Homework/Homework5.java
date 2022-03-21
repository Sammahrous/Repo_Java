package Homework;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {

                                                //Question 1
        String countryName = "Unites States of America";
        System.out.println("\nCountry Name : " + countryName);
        String[] splitByCharacter = countryName.split("");
        System.out.println("Split by Character : " + Arrays.toString(splitByCharacter));
        int length = splitByCharacter.length;
        System.out.println("Country Name Length = " + length);

                                                //Question 2
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String[] sentence2Split = sentence2.split(" ");
        System.out.println("\nSentence2 Split by Words : " + Arrays.toString(sentence2Split));

                                                //Question 3
        String sentence3 = "outFit OF the DAY";
        String abbreviation = sentence3.substring(0, 1).toUpperCase()
                + sentence3.substring(7, 8).toUpperCase()
                + sentence3.substring(10, 11).toUpperCase()
                + sentence3.substring(14, 15).toUpperCase();
            System.out.println("\nAbbreviation : " + abbreviation);

                                                //Question 4
        int num = 32;
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("Divisible by 5 and 3");
        } else {
            System.out.println("\nNum is Not Divisible by 5 and 3");
        }

                                                //Question 5
        double studentScore = 60.99;
        int maxScore = 100;
        double scoreCalculation = (studentScore / maxScore) * 100;
        System.out.println("\nstudent Percentage = " + scoreCalculation + "%");
        if (scoreCalculation >= 91 && scoreCalculation <= 100) {
            System.out.println("Student Grade = A \n");
        } else if (scoreCalculation >= 81 && scoreCalculation <= 90.99) {
            System.out.println("Student Grade = B \n");
        } else if (scoreCalculation >= 71 && scoreCalculation <= 80.99) {
            System.out.println("Student Grade = C \n");
        } else if (scoreCalculation >= 61 && scoreCalculation <= 70.99) {
            System.out.println("Student Grade = D \n");
        } else if (scoreCalculation <= 60.99 && scoreCalculation >= 0) {
            System.out.println("Student Grade = E \n");
        } else if (studentScore > maxScore) {
            System.out.println("Invalid Student Score\n");
        } else if (scoreCalculation < 0) {
            System.out.println("Invalid Max Score\n");
        }

                                                //Question 6
        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live", "give", "living standard", "life"};
        for (int i = 0; i < words.length; i++) {
            String wordsFound = words[i];
            if(wordsFound.length() > 5 && wordsFound.substring(0,1).contains("l")) {
                System.out.println(words[i]);
            }
        }
    }
}










