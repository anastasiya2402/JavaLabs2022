import java.util.Arrays;
import java.util.Scanner;

public class LabProgramArrayStatistics {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int nums[];
        int count;

        // Step 0: Input array values
        count = scnr.nextInt();
        nums = new int[count];
        for (int i = 0; i < count; ++i) {
            nums[i] = scnr.nextInt();
        }
        // Step 1: Find and output minimum and maximum values
        int maxElem = nums[0];
        int minElem = nums[0];
        for (int i=0; i < count; ++i){
            if (nums[i] > maxElem){
                maxElem = nums[i];
            }
            if (nums[i]< minElem){
                minElem = nums[i];
            }
        }
        System.out.printf("Minimum: %d\nMaximum: %d\n", minElem, maxElem);


        // Step 2: Calculate and output mean
        double sumElem = 0;
        for (int i=0; i < count; ++i){
            sumElem = sumElem + nums[i];
        }
        double meanValue = sumElem/count;
        System.out.printf("Mean: %.1f\n", meanValue);

        // Step 3: Check if palindrome
        int numOfTimes = 0;
        for (int i=0; i < count; ++i){
            if (nums[i] == nums[nums.length-i-1]){
                numOfTimes = numOfTimes+1;
            }
        }
        if (numOfTimes == count){
            System.out.println("Palindrome: true");
        }
        else{
            System.out.println("Palindrome: false");
        }

        // Sort array elements in ascending order
        Arrays.sort(nums);
        // Step 4: Find and output median
        double median;
        if ( count % 2 ==0){
            median =(double) (nums[count/2-1] + nums[count/2])/2;
        }
        else {
            median =(double) nums[(count+1)/2-1];
        }
        System.out.printf("Median: %.1f\n", median);


        // Step 5: Find and output mode
        int maxCount = 0;
        int mode=nums[0];
        for (int i = 0; i < count; i++) {
            int countRepeated = 0;
            for (int j = 0; j < count; j++) {
                if (nums[i] == nums[j]) {
                    countRepeated++;
                    int element  = nums[i];
                }
                if (countRepeated > maxCount) {
                    maxCount = countRepeated;
                    mode = nums[i];
                }
            }
        }
        System.out.println("Mode: " + mode);
    }
}
