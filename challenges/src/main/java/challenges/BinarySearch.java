
package challenges;

public class BinarySearch {

    public static int BinarySearcher(int[] incomingArray, int targetNumber ) {

        int firstIndex = 0;
        int lastIndex = incomingArray.length - 1;
        int midway = -1;

        while( firstIndex <= lastIndex ){

            midway = (int) Math.ceil((firstIndex + lastIndex) / 2);

            if ( incomingArray[midway] < targetNumber ){
                firstIndex = midway + 1;

            }else if ( incomingArray[midway] == targetNumber ){
                System.out.println("Element is found at index: " + midway);

                break;

            }else{
                lastIndex = midway - 1;
            }
        }
        if ( firstIndex > lastIndex ){
            return -1;
        }

        return midway;
    }

//    public static void main (String args[]) {
//
//        int arr[] = {10,20,30,40,50};
//        int key = 10;
//        int last=arr.length-1;
//
//        BinarySearcher(arr, key);
//    }

//        if (midway > targetNumber) {
//            lastIndex = (int) (incomingArray.length - 1);
//        } else if (midway < targetNumber) {
//            firstIndex = (int) (incomingArray.length + 1);
//        } else  if (midway == targetNumber) {
//
//        }

//        if (arr.length % 2 !=0) {
//            midway += 1;
//        }
//        return target;

//    public static int[] arrayShiftAndInsert(int[] arr, int num) {
//
//        // Midway for insertion (this still confuses me)
//        double midway = Math.ceil(arr.length / 2);
//        if (arr.length % 2 !=0) {
//            midway += 1;
//        }
//
//        // New array (+1)
//        int modifiedArray[] = new int[arr.length + 1];
//
//        //
//        for (int i = 0; i < arr.length + 1; i++) {
//
//            // Populate elements into new arr (before midway)
//            if (i < midway)
//                modifiedArray[i] = arr[i];
//                // Insert desired element at midway
//            else if (i == midway)
//                modifiedArray[i] = num;
//                // Populate elements into new arr (after midway)
//            else
//                modifiedArray[i] = arr[i -1];
//        }
//        return modifiedArray;
//    }

}
