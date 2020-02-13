# Challenge 27 - Merge Sort

[SEE MY CODE](https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/insertionsort/InsertionSort.java)</br>

### Challenge Description
MergeSort is a combining algorithm that traverses two arrays it receives. (Go more in-depth here)
</br>

### Approach & Efficiency
Time: O(2)</br>
(Go more in-depth here)
</br>
</br>

Space: O(1)</br>
(Go more in-depth here)
</br>
</br>

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

