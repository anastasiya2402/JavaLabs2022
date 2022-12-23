public class ArrayReference {
    public static void main (String[] args) {
        String[] plannedCities = {"Ann Arbor", "Dexter", "Chelsea"};
        String[] myVisits = {"Ann Arbor", "Dexter", "Chelsea"};

        if (equals(plannedCities, myVisits)) {
            System.out.println("My visit was exactly the same as the plan.");
        }

    }

    public static boolean equals(String[] firstArray, String[] secondArray) {
        int index;

        // If the arrays are not the same length, the arrays cannot have the same contents
        if (firstArray.length != secondArray.length)
            return false;

        // Both arrays are now known to be the same length
        for (index = 0; index < firstArray.length; ++index) {
            if (!firstArray[index].equals(secondArray[index])) {
                return false;
            }
        }
        // Both arrays are known to be the same length and have
        // exactly the same items in the same order
        return true;
    }


}
