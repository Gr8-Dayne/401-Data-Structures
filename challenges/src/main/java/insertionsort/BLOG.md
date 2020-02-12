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


