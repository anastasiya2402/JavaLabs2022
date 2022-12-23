import java.util.Arrays;

public class OversizeArray {
    public static int removeFirst(int[] arrayRef, int arraySize, int targetVal) {
        boolean targetFound;
        int index;

        targetFound = false;

        // Step through the array one element at a time
        for (index = 0; index < arraySize; ++index) {
            // If matching element found, move each element to the previous index
            if (targetFound) {
                arrayRef[index - 1] = arrayRef[index];
            }

            // Check if matching element found
            if (arrayRef[index] == targetVal) {
                targetFound = true;
            }
        }

        // If matching element found, array size is one element smaller
        // otherwise array size hasn't changed
        if (targetFound) {
            return arraySize - 1;
        } else {
            return arraySize;
        }
    }

    public static void main(String[] args) {
        int[] onlineSales = {4, 3, 1, 4, 3, 9};
        int onlineSalesSize = 6;
        removeFirst(onlineSales, onlineSalesSize, 4);
        System.out.println(onlineSalesSize);
        System.out.println(Arrays.toString(onlineSales));
        removeFirst(onlineSales, onlineSalesSize, 4);
        System.out.println(onlineSalesSize);
        System.out.println(Arrays.toString(onlineSales));
        int[] salesList = new int[4];

        fill(salesList, 3, 7);
        System.out.println(fill(salesList, 3, 7));
        System.out.println(Arrays.toString(salesList));

    }

    public static int fill(int[] arrayRef, int arraySize, int value) {
        int size = Math.min(arrayRef.length, arraySize);
        for (int index = 0; index < size; ++index) {
            arrayRef[index] = value;
        }
        return size;
    }
}