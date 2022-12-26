import java.util.Scanner;

public class TrackLapsToMiles {
/**
 *44.25 LAB: Track laps to miles
 *One lap around a standard high-school running track is exactly 0.25 miles. Define a method named lapsToMiles that
 *takes a double as a parameter, representing the number of laps, and returns a double that represents the number of
 *miles. Then, write a main program that takes a number of laps as an input, calls method lapsToMiles() to calculate
 *the number of miles, and outputs the number of miles.
  */
    public static double lapsToMiles(double userLaps){
        double userMiles = userLaps * 0.25;
        return userMiles;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number of laps: ");
        double userLaps = scnr.nextDouble();
        System.out.printf("%.2f\n", lapsToMiles(userLaps));
    }

}
