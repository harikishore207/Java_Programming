/*There are two common systems for measuring temperature. Degrees of Fahrenheit (ºF) are used in the U.S. and some other countries, while degrees of Celsius (ºC) are in use in most European countries and in many countries throughout the world. The freezing point of water is 0 degrees Celsius and 32 degrees Fahrenheit, 10ºC is 50ºF, 20ºC is 68ºF, 30ºC is 86ºF, and so on.
You can see that 10 degrees on the Celsius scale corresponds to 18 degrees on the Fahrenheit scale.
Write a program that can convert degrees Fahrenheit to degrees Celsius, or vice versa.
Improve your program so that it converts the given numerical value to both Degrees Celsius and to Degrees Fahrenheit. For example, if the user of the program types in 30, your program should say how much 30 ºC is in Degrees Fahrenheit and how much 30 ºF is in Degrees Celsius.
Repeat this task using sentinel control loop until user enters ‘N’ to not to continue.
*/

import java.util.Scanner;

public class pt2 {
    public static void convertF(double Celsius) {
        double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("The value of Fahrenheit is = " + Fahrenheit + "°F");
    }

    public static void convertC(double F) {
        double C = (F - 32) * ((double) 5 / 9);
        System.out.println("The value of Celsius is = " + C + "°C");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.print("Enter a temperature value: ");
            double Value = scanner.nextDouble();

            convertF(Value);
            convertC(Value);

            System.out.print("Do you want to continue? (Y/N): ");
            continueChoice = scanner.next().charAt(0);
        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Thank you for using the temperature converter!");
    }
}

