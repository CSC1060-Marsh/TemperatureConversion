import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //System.out.println("Type something for me");
       // String line = sc.nextLine();
        //System.out.println("You typed: " + line);

      //  System.out.println("Now type a number: ");
       // int number = sc.nextInt();
        //System.out.println("Here's your number: " + number);

       // int numberToThePowerOf2 = number * number;
       // System.out.println("Big Number: " + numberToThePowerOf2);

        System.out.println("Type the Fahrenheit number to convert.");

        int fahrenheit = sc.nextInt();

        int celsius = (fahrenheit - 32) * (5 / 9);

        System.out.println("That number in Celsius is " + celsius);

        int kelvin = (int) (celsius + 273.15);

        System.out.println("That number in Kelvin is " + kelvin);


    }
}
