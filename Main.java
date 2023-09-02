import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        // This introduces the Scanner function to the program, allowing for inputs to be made.

        System.out.println("Type the Fahrenheit number to convert.");
        // This prompts the user to input the number they want to convert.

        double fahrenheit = sc.nextDouble();
        // This defines the variable "fahrenheit" as the input the user just entered.

        double celsius = (fahrenheit - 32) * ((double) 5 / 9);
        // This defines the variable "celsius" as the conversion from Fahrenheit to Celsius.

        double kelvin = (celsius + 273.15);
        // This defines the variable "kelvin" as the conversion from Celsius to Kelvin.

        System.out.println("That number is equal to " + celsius + " Celsius.");
        // This outputs the value from the conversion to Celsius in a complete sentence to allow the user to understand the output.

        System.out.println("That number is equal to " + kelvin + " Kelvin.");
        // This outputs the value from the conversion from Celsius to Kelvin, giving the second output the user wants.

    }
}