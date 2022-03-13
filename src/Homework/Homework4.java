package Homework;

public class Homework4 {
    public static void main(String[] args) {
                                    //Task 1
        String sentence1 = "hhhh";
            System.out.println("Value of sentence1 = " + sentence1);
        int lengthOfSentence1 = sentence1.length();
            System.out.println("Length of sentence1 = " + lengthOfSentence1);
        double result1 = lengthOfSentence1 >= 5 ? 10 : 15;
            System.out.println("Result of sentence1 = " + result1);

                                    //Task 2
        String myName = "Sam Mahrous";
            System.out.println("\nMy Name: " + myName);
        int myNameLength = myName.length();
            System.out.println("Length of My Name = " + myNameLength);
        boolean lastIndex = myName.endsWith("a");
            System.out.println("If last index of my name ends with an 'a' : " + lastIndex);
        boolean name = myName.contains("a");
            System.out.println("If my name contains letter 'a' : " + name);

                                    //Task 3
        String statement = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        boolean king = statement.equalsIgnoreCase(statement);
            System.out.println("\nIf statement contains the word 'king' : " + king);
        boolean eW = statement.equalsIgnoreCase(statement);
            System.out.println("If statement contains the word 'EW' : " + eW);

                                    //Task 4
        String statement1 = "kINg";
        String titleCase = statement1.substring(0,1).toUpperCase() + statement1.substring(1).toLowerCase();
            System.out.println("\nConvert 'kINg' to Title Case : " + titleCase);
        String statement2 = "QUEEN";
        String titleCase1 = statement2.substring(0,1).toUpperCase() + statement2.substring(1).toLowerCase();
            System.out.println("Convert 'QUEEN' to Title Case : " + titleCase1);










    }
}
