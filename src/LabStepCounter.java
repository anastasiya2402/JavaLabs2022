import java.util.Scanner;

public class LabStepCounter {
/**
 * 44.26 LAB: Step counter
 *
 * A pedometer treats walking 1 step as walking 2.5 feet. Define a method named feetToSteps that takes a double as a
 * parameter, representing the number of feet walked, and returns an integer that represents the number of steps walked.
 * Then, write a main program that reads the number of feet walked as an input, calls method feetToSteps() with the
 * input as an argument, and outputs the number of steps.
 *
 * Use floating-point arithmetic to perform the conversion.
  */

    public static int feetToSteps(double numFeet){
        return (int) (numFeet/2.5);
    }
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter number of feet: ");
            double numFeet = scnr.nextDouble();
            System.out.println(feetToSteps(numFeet));
        }
}
