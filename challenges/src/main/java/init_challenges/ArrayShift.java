package init_challenges;

import java.lang.*;

public class ArrayShift {
    public boolean arrayShiftAndInsert() {
        return true;
    }

    public static int[] arrayShiftAndInsert(int[] arr, int num) {

        // Midway for insertion (this still confuses me)
        double midway = Math.ceil(arr.length / 2);
        if (arr.length % 2 !=0) {
            midway += 1;
        }

        // New array (+1)
        int modifiedArray[] = new int[arr.length + 1];

        //
        for (int i = 0; i < arr.length + 1; i++) {

            // Populate elements into new arr (before midway)
            if (i < midway)
                modifiedArray[i] = arr[i];
                // Insert desired element at midway
            else if (i == midway)
                modifiedArray[i] = num;
                // Populate elements into new arr (after midway)
            else
                modifiedArray[i] = arr[i -1];
        }
        return modifiedArray;
    }
}