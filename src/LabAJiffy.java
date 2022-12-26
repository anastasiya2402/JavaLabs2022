import java.util.Scanner;

public class LabAJiffy {
/**
 * 44.27 LAB: A jiffy
 *
 * A "jiffy" is the scientific name for 1/100th of a second. Define a method named jiffiesToSeconds that takes a
 * float as a parameter, representing the number of "jiffies", and returns a float that represents the number of seconds.
 * Then, write a main program that reads the number of jiffies as an input, calls method jiffiesToSeconds() with the
 * input as argument, and outputs the number of seconds.
 *
 * Output each floating-point value with three digits after the decimal point, which can be achieved as follows:
 * System.out.printf("%.3f\n", yourValue);
  */
    public static double jiffiesToSeconds(double userJiffie){
        double userSeconds = userJiffie/100;
        return userSeconds;
    }

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter a jiffy: ");
            double userJiffie = scnr.nextDouble();
            System.out.printf("%.3f\n", jiffiesToSeconds(userJiffie));
        }

}
