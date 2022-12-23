import java.util.Arrays;

public class ArraysAddingElements {
    // Method uses a perfect size array.
    public static String[] addElement(String[] arrayRef, String addMe) {
        String[] returnArray = new String[arrayRef.length + 1];
        int index;

        // Copy the array elements to the newly constructed array
        for (index = 0; index < arrayRef.length; ++index) {
            returnArray[index] = arrayRef[index];
        }

        // Add in the new element to the end of the array
        returnArray[arrayRef.length] = addMe;

        return returnArray;
    }

    // Method uses an oversize array.
    public static int addElement(String[] arrayRef, int currentSize, String addMe) {
        if (currentSize == arrayRef.length) return currentSize;

        arrayRef[currentSize] = addMe;
        currentSize++;

        return currentSize;
    }
    public static void main (String[] args){
        String[] myArray = {"Hello", "How are you?", "Bye", "Good"};
        addElement(myArray, 3, "add me");
        System.out.println(addElement(myArray, 3, "add me"));
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(addElement(myArray, "add me")));
    }
}
