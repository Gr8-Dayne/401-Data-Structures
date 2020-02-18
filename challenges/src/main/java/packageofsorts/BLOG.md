
# Challenge 28 - Quick Sort

[SEE MY CODE]()</br>

### Challenge Description
QuickSort is an algorithm that prioritizes speed while sorting. (Go more in-depth here)
</br>

### Approach & Efficiency
Time: O(?)</br>
(Go more in-depth here)</br></br>

Space: O(?)</br>
(Go more in-depth here)</br></br>

### Pseudo Code

```java
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```



# Challenge 27 - Merge Sort

[SEE MY CODE]()</br>

### Challenge Description
MergeSort is a combining algorithm that recursively calls upon itself to divide it's given array in half until there is only one object in each of the newly-divided arrays. The method then re-traces it's steps to sort the values of the arrays as they come back together until they are one array again, although this time, the array is in order.
</br>

### Approach & Efficiency
Time: O(n Log n)</br>
</br></br>

Space: O(n)</br>
</br></br>

### Pseudo Code

```java
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```



# Challenge 26 - Insertion Sort

[SEE MY CODE](https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/insertionsort/InsertionSort.java)</br>

### Challenge Description
InsertionSort is a sorting algorithm that traverses an array it receives. During the transversing, [i] and [j] are comparing and switching as required therefore sorting is occurring.</br>

### Approach & Efficiency
Time: O(2)</br>
The basic operation of this algorithm is comparison. This will transverse and change the input array twice via a nested loop. In conclusion the algorithm is going to be O(2).</br></br>

Space: O(1)</br>
Original array is manipulated, no additional space is consumed.</br>

### Pseudo Code

```java
SelectionSort(int []arr)   
    DECLARE n <-- arr.Length; 
    FOR i = 0; i to n - 1  
        DECLARE min <-- i; 
        FOR j = i + 1 to n 
            if (arr[j] < arr[min]) 
                min <-- j; 
 
        DECLARE temp <-- arr[min]; 
        arr[min] <-- arr[i]; 
        arr[i] <-- temp; 
```  


