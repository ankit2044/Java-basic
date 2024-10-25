package lab_2;
import java.util.Arrays;

public class Second_highest {
    public static void main(String[] args) {
        // Original array
        int[] array = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        // Create a subarray from index 2 to 7 (exclusive)
        int[] subArray = Arrays.copyOfRange(array, 2, 7);

        System.out.print("Sub array: ");
        for (int i = 0; i < subArray.length; i++) {
            System.out.print(subArray[i] + " ");
        }
        System.out.println();

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i] > highest) {
                secondHighest = highest;
                highest = subArray[i];
            } else if (subArray[i] > secondHighest && subArray[i] != highest) {
                secondHighest = subArray[i];
            }
        }


        System.out.println("2nd Highest element: " + secondHighest);
    }
}

