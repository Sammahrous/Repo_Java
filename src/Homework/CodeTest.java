package Homework;


import java.util.Arrays;

    public class CodeTest {
        //Q1
        public static int[] sortArray (int[] input)
        {
            Arrays.sort(input);
            int [] outputArr = input;
            System.out.println("Sorted Array : " + Arrays.toString(outputArr));
            return outputArr;



        }
        // Q2
        public static int returnedValue (int input)
        {
            int output = input;
            while (output != 0) {
                System.out.println(output%10);
                output = output /10;
                System.out.println();
            }
            return output;
        }

        //Q3
        public static int [] revisedArray (int [] Numbers , remove )
        {
            int remove =
            int revised = Numbers

        }



        //Q4
        public static String commonString (String[] statement1, statment2)
        {
            String statement1 = "";
        }







        public static void main(String[] args) {
            System.out.println(sortArray(20, 30, 10, 40,0));

            System.out.println(returnedValue(123));




        }






    }

}
