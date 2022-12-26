import java.util.Scanner;

public class LabDrivingCost {
/**
 * 44.28 LAB: Driving cost - methods
 *
 * Write a method drivingCost() with input parameters milesPerGallon, dollarsPerGallon, and milesDriven that returns the
 * dollar cost to drive those miles. All items are of type double. The method called with arguments (20.0, 3.1599, 50.0)
 * returns 7.89975.
 *
 * Define that method in a program whose inputs are the car's miles per gallon and the price of gas in dollars per
 * gallon (both doubles). Output the gas cost for 10 miles, 50 miles, and 400 miles, by calling your drivingCost()
 * method three times.
 *
 * Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
 * System.out.printf("%.2f", yourValue);
 *
 * The output ends with a newline.
  */
    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven){
        double totalCost = milesDriven*dollarsPerGallon/milesPerGallon;
        return totalCost;
    }

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter miles per gallon: ");
            double milesPerGallon = scnr.nextDouble();
            System.out.print("Enter cost per gallon : $ ");
            double dollarsPerGallon = scnr.nextDouble();
            double milesDriven = 1;
            System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, milesDriven) * 10);
            System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, milesDriven) * 50);
            System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, milesDriven) * 400);
        }
}
