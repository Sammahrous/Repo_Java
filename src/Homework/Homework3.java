package Homework;

public class Homework3 {
    public static void main(String[] args) {
                        // Celsius to Fahrenheit Conversion
                        // Equation: fT = cT * 9/5 + 32
        double cTemp = 30;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("Celsius to Fahrenheit Conversion: " + cTemp + "˚C" + " = " + fTemp + "˚F");

                        // Celsius to Kelvin Conversion
                        // Equation: kT = cT + 273.15
        double kTemp = cTemp + 273.15;
        System.out.println("Celsius to Kelvin Conversion: " + cTemp + "˚C" + " = " + kTemp + "˚K");

                        // Fahrenheit to Celsius Conversion
                        // Equation: cT = (fT - 32) * 5/9
        double fTemp1 = 86;
        double cTemp1 = (fTemp1 - 32) * 5/9;
        System.out.println("Fahrenheit to Celsius Conversion: " + fTemp1 + "˚F" + " = " + cTemp1 + "˚C");

                        // Fahrenheit to Kelvin Conversion
                        // Equation: kT = (fT - 32) * 5/9 + 273.15
        double kTemp1 = (fTemp1 - 32) * 5/9 + 273.15;
        System.out.println("Fahrenheit to Kelvin Conversion: " + fTemp1 + "˚F" + " = " + kTemp1 + "˚K");

                        // Kelvin to Celsius Conversion
                        // Equation: cT = kT - 273.15
        double kTemp2 = 303.15;
        double cTemp2 = kTemp2 - 273.15;
        System.out.println("Kelvin to Celsius Conversion: " + kTemp2 + "˚K" + " = " + cTemp2 + "˚C");

                        // Kelvin to Fahrenheit Conversion
                        // Equation: fT = (kT - 273.15) * 9/5 + 32
        double fTemp2 = (kTemp2 - 273.15) * 9/5 + 32;
        System.out.println("Kelvin to Fahrenheit Conversion: " + kTemp2 + "˚K" + " = " + fTemp2 + "˚F");















    }
}
