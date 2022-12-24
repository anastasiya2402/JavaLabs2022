import java.util.Arrays;

public class ResizingArrays {
    public static void main (String[] args) {
        int[] dataArray = {1, 3, 5};
        dataArray =initializeArray(5, 10);
        System.out.println(Arrays.toString(dataArray));

        String[] originalArray = {"Raven", "Daisy", "Jasmine"};
        originalArray = resize(originalArray, 5);
        System.out.println(Arrays.toString(originalArray));

        int[] salesData = {1, 5, 3};
        salesData = repeat(salesData);
        System.out.println(Arrays.toString(salesData));

        salesData = repeat(salesData);
        System.out.println(Arrays.toString(salesData));
    }
    public static int[] initializeArray(int value, int size) {
        int[] result = new int[size];
        int index;

        for (index = 0; index < result.length; ++index) {
            result[index] = value;
        }

        return result;
    }
    public static String[] resize(String[] arrayReference, int newSize) {
        String[] resultArray = new String[newSize];
        int index;
        int numToCopy;

        // Determine the number of array elements to copy
        numToCopy = Math.min(newSize, arrayReference.length);

        // Copy elements from arrayReference to resultArray
        for (index = 0; index < numToCopy; ++index) {
            resultArray[index] = arrayReference[index];
        }

        return resultArray;
    }

    public static int[] repeat(int[] sourceArray) {
        int[] resultArray = new int[2 * sourceArray.length];
        int index;

        for (index = 0; index < sourceArray.length; ++index) {
            resultArray[index] = sourceArray[index];
            resultArray[index + sourceArray.length] = sourceArray[index];
        }

        return resultArray;
    }
}
