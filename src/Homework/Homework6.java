package Homework;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {

                                //Question 1 (Abbreviate Sentence3)
        String sentence1 = "make America great again";
        String abbreviation = sentence1.substring(0, 1).toUpperCase()
                + sentence1.substring(5, 6).toUpperCase()   //allocating and assigning upper cases based on Index
                + sentence1.substring(13, 14).toUpperCase()
                + sentence1.substring(19, 20).toUpperCase();
            System.out.println("\nAbbreviation : " + abbreviation);

                                //Question 2 (Reverse Original Sentence)
        String sentence2 = "make america great again";
            System.out.println("\nOriginal Sentence : " + sentence2);
        String reverse = "";
        String[] split = sentence2.split(" ");  //splitting by space
        int numberOfWords = split.length;           // sentence length
            System.out.println("Sentence Length = " + numberOfWords);
        for (int r = 1; r <= split.length; r++) {          //for loop reverse sentence
            reverse = reverse + " " + split [split.length -r];
        }
        reverse = reverse.trim();   //trimming out extra spaces
            System.out.println("Reversed Sentence : " + reverse);

                                //Question 3 (Title Case)
        String sentence3 = "make america great again";
            System.out.println("\nOriginal Sentence : " + sentence3);
        String titleCase = sentence3.substring(0,1).toUpperCase() + sentence3.substring(1,5).toLowerCase()
                + sentence3.substring(5,6).toUpperCase() + sentence3.substring(6,13).toLowerCase()
                + sentence3.substring(13,14).toUpperCase() + sentence3.substring(14,19).toLowerCase()
                + sentence3.substring(19,20).toUpperCase() + sentence3.substring(20,24).toLowerCase();
            System.out.println("Title Case : " + titleCase);

                                    //Question 3 (Minimum Value)
        int[] numbers = {-1, 1};
        int minimumValue = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers [i] < minimumValue) {
                minimumValue = numbers [i];
            }
        }
        System.out.println("\nMinimum Value = " + minimumValue);

                            //______________________________________________________//

        int[] numbers1 = {1, 21, 87, 23};
        int minimumValue1 = 1;
        for (int i = 0; i < numbers.length; i++){
            if (numbers1 [i] <= minimumValue1) {
                minimumValue1 = numbers1 [i];
            }
        }
        System.out.println("Minimum Value = " + minimumValue1);

                            //______________________________________________________//

        int[] numbers2 = {87, 23, 89, 0, 54, 23,};
        int minimumValue2 = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers2 [i] <= minimumValue2) {
                minimumValue2 = numbers2 [i];
            }
        }
        System.out.println("Minimum Value = " + minimumValue2);










    }

}
