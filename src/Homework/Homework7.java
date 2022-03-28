package Homework;

public class Homework7
{
                                                // Methods //
            //Method 1//
    // Creating an abbreviation of a given sentence.
    //static outside the main method (string output, method name , statement input - for user)
    //string [] split [index] - statement input by the user will be split to words.
    //string for the result to be stored at : abbreviation.
    //for loop int i = 0 < statement split . length   i++
    // abbreviation , abbreviation and statement split [index] to uppercase at char [0].
    // return abbreviation

    // create psvm and use abbreviation method and sout the result of any given statement.

            // Question 1//
    public static String makeAbbreviation (String Statement)
            //    output -  method name   -    user input
    {
        String[] statementSplit = Statement.split(" ");  // Split by space = words
        String abbreviation = "\nAbbreviation : ";        // result storage
        for (int i = 0 ; i< statementSplit.length;i++)        // abbreviation loop
        {
            abbreviation += statementSplit[i].toUpperCase().charAt(0);
            // statement split at [index], uppercase each index at char [0].
        }
        return abbreviation;
    }
            //----------------------------------------------------------------------------//

            //Method 2//
    // Creating TitleCase of any given sentence.
    //static outside the main method (string output, method name , statement input by the user)
    //string [] split [index] - statement input by the user will be split to words.
    //string for the result to be stored at : TileCase.
    //for loop int i = 0 < statement split . length   i++
    // tileCase + titleCase and statement split [index] to uppercase at char [0]
    // + statementSplit[i].substring(1).toLowerCase() + " ";.
    // return TitleCase

    // create psvm and use TitleCase method and sout the result of any given statement.

            // Question 2//
    public static String makeTitleCase (String Statement)
            //   output -  method name  -  user input
    {
       String [] statementSplit = Statement.split(" ");     // Split by space = words
       String  titleCase = "\nTileCase : ";                     // result storage
       for (int i = 0; i< statementSplit.length; i++)       // TitleCase loop
       {
        titleCase += statementSplit[i].toUpperCase().charAt(0) + statementSplit[i].substring(1).toLowerCase() + " ";
       }
       return titleCase;
    }
            //----------------------------------------------------------------------------//

            // Question 3//
    public static int maximumValue (int[] Numbers)
            //  output - method name - user input
    {
        int[] inputNumbers = {23, 54, 76, 12, 67, 90, 23};
        int  maximumValue = 0;
        for (int i = 0; i<= Numbers.length; i++)
        {
            if (inputNumbers[i] >= maximumValue){
                maximumValue = inputNumbers[i];
            }
        }
        return maximumValue;

    }
            //----------------------------------------------------------------------------//

            // Question 4//
    public static String makePalindrome (String palindrome)
            //   output -  method name  -  user input
    {
        palindrome = "eye";
        String reverse = "";
        int length = palindrome.length();
        for ( int i = length - 1; i <= 0; i++ )
        {
            reverse += palindrome.charAt(i);
        }
        if (palindrome.equals(reverse))
            System.out.println("Word is a palindrome.");
        else
            System.out.println("Word is not a palindrome.");

        return palindrome;
    }
            //----------------------------------------------------------------------------//

            // Question 5//
    public static String longestString (String words)
            //   output -  method name  -  user input
    {
        String[] statementSplit = words.split(" ");
        for (int i = 0; i < statementSplit.length; i++) {
            String wordsFound = statementSplit[i];
            if (wordsFound.length() > 5) {
                System.out.println("\nLongest String : " + statementSplit[i]);
            }
        }
        return words;
    }
            //----------------------------------------------------------------------------//

        public static void main(String[] args){
                // Question 1 print //
        String abbreviation = makeAbbreviation("happy new year to you dear");
        System.out.println(abbreviation);
                //----------------------------------------------------------------------------//

                // Question 2 print //
        String tileCase = makeTitleCase("happy new year to you dear");
        System.out.println(tileCase);
                //----------------------------------------------------------------------------//

                // Question 3 print //
        //System.out.println(maximumValue());
                //----------------------------------------------------------------------------//

                // Question 4 print //
        System.out.println(makePalindrome("eye"));
                //----------------------------------------------------------------------------//

                // Question 4 print //
        System.out.println(longestString("happy new year peacefull king kong"));
    }












}








