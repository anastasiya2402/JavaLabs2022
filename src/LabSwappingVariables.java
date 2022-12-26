import java.util.Scanner;
public class LabSwappingVariables {
    /**
     * 44.29 LAB: Swapping variables
     *
     * Define a method named swapValues that takes an array of four integers as a parameter, swaps array elements at indices
     * 0 and 1, and swaps array elements at indices 2 and 3. Then write a main program that reads four integers from input
     * and stores the integers in an array in positions 0 to 3. The main program should call function swapValues() to swap
     * array's values and print the swapped values on a single line separated with spaces.
     */
    public static void swapValues(int[] values){
        int temp;
        for (int i = 0; i < values.length/2; i++){
            temp = values[2*i];
            values[2*i] = values[2*i+1];
            values[2*i+1] = temp;
        }

        System.out.print(values[0]+" "+values[1]+" "+values[2]+" "+values[3]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] values = new int[4];
        System.out.println("Please enter 4 integers separated by spaces: ");
        for (int i =0; i < 4; i++){
            values[i] = scnr.nextInt();
        }
        swapValues(values);
    }

}
