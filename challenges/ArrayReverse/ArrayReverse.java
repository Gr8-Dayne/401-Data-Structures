import java.util.Arrays;

// This code was generated with the assistance of geeksforgeeks.org and with the provided code commented out below.

public class ArrayReverse {

  // Create "function"
  static void reverseArray (int a[], int n) {
    int[] b = new int[n];
    int j = n;
    for (int i = 0; i < n; i++){
      b[j -1] = a[i];
      j = j -1;
    }

    // Show new reversed array
    System.out.println("Reversed Array is:");
    for (int k = 0; k < n; k++) {
      System.out.println(b[k]);
    } 
  }

  // Create array and relate to reverseArray
  public static void main (String[] args) {
    int [] arr = {7, 11, 14, 20, 33, 80};
    System.out.println(Arrays.toString(arr));
    reverseArray(arr, arr.length);
  }

}


// import java.util.Arrays;
// public class ArrayReverse {
//   public static void main (String[] args) {
//     // create the array to test your code on later
//     int[] startArr = new int[] {1,2,3,4,5,10};
//     // print it out, nicely
//     System.out.println(Arrays.toString(startArr));
//     // call your reverseArray method and save the result in a variable
//     int[] endArr = reverseArray(startArr);
//     // print out the result, nicely
//     System.out.println(Arrays.toString(endArr));
//   }
//   // the method you should write, to reverse an array
//   public static int[] reverseArray(int[] inputArray) {
//     // your code goes here!
//     // for now, to make sure that it compiles, here is a bad answer
//     return new int[0];
//   }
// }