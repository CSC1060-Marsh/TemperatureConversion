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

        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * ((double) 5 / 9);

        double kelvin = (celsius + 273.15);

        System.out.println("That number is equal to " + celsius + " Celsius.");

        System.out.println("That number is equal to " + kelvin + " Kelvin.");

        


    }
}
