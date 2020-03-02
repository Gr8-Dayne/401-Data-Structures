## Class 38 Code Challenge - Depth First

#### Summary


#### Challenge
Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. Without utilizing any of the built-in methods available to your language, return a collection of nodes in their pre-order depth-first traversal order.

#### Approach & Efficiency


#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC38WB.jpg>White Board<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/graph/DepthFirst.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/graph/DepthFirstTest.java>Tests<a/>





## Class 37 Code Challenge - Get Edge

#### Summary


#### Challenge
Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

#### Approach & Efficiency


#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC37WB.jpg>White Board<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/graph/GetEdge.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/graph/GetEdgeTest.java>Tests<a/>





## Class 36 Code Challenge - Breadth First

#### Summary


#### Challenge
Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

#### Approach & Efficiency


#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC36WB.jpg>White Board<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/graph/BreadthFirst.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/graph/BreadthFirstTest.java>Tests<a/>





## Class 35 Code Challenge - Graph Implementation

#### Summary


#### Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

* AddNode()
  - Adds a new node to the graph
  - Takes in the value of that node
  - Returns the added node

* AddEdge()
  - Adds a new edge between two nodes in the graph
  - Include the ability to have a “weight”
  - Takes in the two nodes to be connected by the edge
  - Both nodes should already be in the Graph

* GetNodes()
  - Returns all of the nodes in the graph as a collection (set, list, or similar)

* GetNeighbors()
  - Returns a collection of nodes connected to the given node
  - Takes in a given node
  - Include the weight of the connection in the returned collection

* Size()
  - Returns the total number of nodes in the graph

#### Approach & Efficiency


#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/tree/master/challenges/src/main/java/graph>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/graph/GraphTest.java>Tests<a/>





## Class 33 Code Challenge - Tree Intersection

#### Summary
This one took me a long time, but I'm glad I just sat down and did it finally.

#### Challenge
* Write a function called tree_intersection that takes two binary tree parameters.

* Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

#### Approach & Efficiency
I started this challenge with a good plan in my head but I ended up second-guessing myself and trying to do it another way than my initial plan. I ended up going back to my initial plan an finding my solution a couple places online.

#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC33WB.png>White Board<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/hashtable/TreeIntersection.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/hashtable/TreeIntersectionTest.java>Tests<a/>





## Class 32 Code Challenge - First Repeated Word

#### Summary
The biggest difficulties I ran into for this challenge's duration were that I would fix something with the previos CC and something else would break on this CC.

#### Challenge
Implement a Hashtable with the following methods:

* Write a function that accepts a lengthy string parameter.

* Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

#### Approach & Efficiency
A LOT of ajusting the previous CC.

#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC32WB.jpg>White Board<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/hashtable/RepeatedWord.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/hashtable/RepeatedWordTest.java>Tests<a/>





## Class 30 Code Challenge - Hashtables

#### Summary
I went through about 4 different variations of how to go about this, I learned a lot.

#### Challenge
Implement a Hashtable with the following methods:

* add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

* get: takes in the key and returns the value from the table.

* contains: takes in the key and returns a boolean, indicating if the key exists in the table already.

* hash: takes in an arbitrary key and returns an index in the collection.

#### Approach & Efficiency
Initially, I thought I would try to do it a way nobody in the class seemed to be doing but it proved very complex so I erred on the side of caution. Much research was conducted and assistance here and there from my TA and peers.

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/hashtable/HashMap.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/hashtable/HashMapTest.java>Tests<a/>





## Class 28 Code Challenge - Merge Sort

#### Summary

 - Provide a visual step through for each of the sample arrays based on the provided pseudo code
 
 - Convert the pseudo-code into working code in your language
 
 - Present a complete set of working tests

#### Challenge Description

The feature task was listed as:

* Review the pseudocode provided, then trace the algorithm by stepping through the process with the provided sample array. Document your explanation by creating a blog article that shows the step-by-step output after each iteration through some sort of visual.


#### Approach & Efficiency

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

###### Inputs: 

* Primary Sample Array: [8, 4, 23, 42, 16, 15]

* Reverse-sorted: [20, 18, 12, 8, 5, -2]

* Few uniques: [5, 12, 7, 5, 5, 7]

* Nearly-sorted: [2, 3, 5, 7, 13, 11]

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/packageofsorts/BLOG.md>BLOG.md<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/packageofsorts/OfSorts.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/packageofsorts/OfSortsTest.java>Tests<a/>

#### Credits

People and assets that assisted me with this Code Challenge are sited within my code.





## Class 27 Code Challenge - Merge Sort

#### Summary

 - Provide a visual step through for each of the sample arrays based on the provided pseudo code
 
 - Convert the pseudo-code into working code in your language
 
 - Present a complete set of working tests

#### Challenge Description

The feature task was listed as:

* Review the pseudocode provided, then trace the algorithm by stepping through the process with the provided sample array. Document your explanation by creating a blog article that shows the step-by-step output after each iteration through some sort of visual.


#### Approach & Efficiency

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

###### Inputs: 

* Primary Sample Array: [8, 4, 23, 42, 16, 15]

* Reverse-sorted: [20, 18, 12, 8, 5, -2]

* Few uniques: [5, 12, 7, 5, 5, 7]

* Nearly-sorted: [2, 3, 5, 7, 13, 11]

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/packageofsorts/BLOG.md>BLOG.md<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/packageofsorts/OfSorts.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/packageofsorts/OfSortsTest.java>Tests<a/>

#### Credits

People and assets that assisted me with this Code Challenge are sited within my code.





## Class 26 Code Challenge - Insertion Sort

#### Summary

1 - Provide a visual step through for each of the sample arrays based on the provided pseudo code

2 - Convert the pseudo-code into working code in your language

3 - Present a complete set of working tests

#### Challenge Description

The feature task was listed as:

* Review the pseudocode provided, then trace the algorithm by stepping through the process with the provided sample array. Document your explanation by creating a blog article that shows the step-by-step output after each iteration through some sort of visual.


#### Approach & Efficiency

    InsertionSort(int[] arr)

      FOR i = 1 to arr.length

        int j <-- i - 1
        int temp <-- arr[i]

        WHILE j >= 0 AND temp < arr[j]
          arr[j + 1] <-- arr[j]
          j <-- j - 1

        arr[j + 1] <-- temp

Inputs: 

* Sample Array: [8, 4, 23, 42, 16, 15]

* Reverse-sorted: [20, 18, 12, 8, 5, -2]

* Few uniques: [5, 12, 7, 5, 5, 7]

* Nearly-sorted: [2, 3, 5, 7, 13, 11]

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/packageofsorts/BLOG.md>BLOG.md<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/packageofsorts/OfSorts.java>Code<a/>

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/packageofsorts/OfSortsTest.java>Tests<a/>

#### Credits

Daisy helped me with thinking through this problem to find a solution as well as with the BLOG.md.<br>
Websites: <a href=https://www.geeksforgeeks.org/insertion-sort/>geeksforgeeks/insertion-sort<a/> and <a href=https://www.geeksforgeeks.org/bubble-sort/>geeksforgeeks/bubble-sort<a/>.





## Class 18 Code Challenge - Maximum Value

#### Summary

This was far easier once I took a crack at it after doing CC17, not sure why.

#### Challenge Description

The feature task was listed as:

* Write a breadth first traversal method which takes a Binary Tree as its unique input. Traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.


#### Approach & Efficiency

Through research online and a careful "plan as I go" approach to White Boarding, I was able to solve this challenge.

#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC18.png>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/tree/Tree.java>Code<a/>

#### Credits

People and assets that assisted me with this Code Challenge are sited within my code.





## Class 17 Code Challenge - Breadth-first Traversal

#### Summary

This took me FAR longer than I hoped it would. I think in total I spent about 6 hours on this (a big part of it was researching what I missed in class and modifying previously created classes to be more "generic").

#### Challenge Description

The feature task was listed as:

* Write a breadth first traversal method which takes a Binary Tree as its unique input. Traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

#### Approach & Efficiency

Through research online and a careful "plan as I go" approach to White Boarding, I was able to solve this challenge.

#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC17.png>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/tree/Tree.java>Code<a/>

#### Credits

Daisy assisted me with better understanding this Code Challenge. Additionally, citations can be found throughout my code.





## Class 16 Code Challenge - FizzBuzz

#### Summary

I hate that it took me this long to accomplish this task but I am happy that I finished it in spite of me being sick.

#### Challenge Description

The feature task was listed as:

* Write a function called FizzBuzzTree which takes a tree as an argument.

* Without utilizing any of the built-in methods available to your language, determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:

* If the value is divisible by 3, replace the value with “Fizz”

* If the value is divisible by 5, replace the value with “Buzz”

* If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

* If the value is not divisible by 3 or 5, simply turn the number into a String.

#### Approach & Efficiency

Through research online, I was able to solve this challenge.

#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/CC16WB.png>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/utilities/FizzBuzzTree.java>Code<a/>

#### Credits

TA James and Instructor Nicholas assisted me with this Code Challenge





## Class 15 Code Challenge - Binary Tree and BST Implementation

#### Summary


#### Challenge Description

The feature task was listed as: 

* Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

* Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.

* Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.


#### Approach & Efficiency

Through research and trial and error, code was written to complete today's feature tasks.

#### Solution
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/tree/master/challenges/src/main/java/tree>Code<a/>

#### Credits

TA James and Instructor Nicholas assisted me with this Code Challenge





## Class 13 Code Challenge - Multi-bracket Validation

#### Summary



#### Challenge Description

The feature task was listed as: Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced.

Brackets:
* ()
* []
* {}

#### Approach & Efficiency

Lot's of reading about different Data types.

#### Solution

<a href=https://raw.githubusercontent.com/Gr8-Dayne/401-Data-Structures/master/challenges/assets/MultiBracket.jpg>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/utilities/MultiBracketValidation.java>Code<a/>






## Class 12 Code Challenge - First-in, First out Animal Shelter

#### Summary

I re-wrote a couple of classes to fit the needs of this specific package as changing the originals would cause problems for other pieces of my code.

#### Challenge Description

The feature task was listed as: Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.

* enqueue(animal)
* dequeue(pref)

#### Approach & Efficiency

More trial and error that I would have liked but overall, an assignment I won't soon forget.

#### Solution

<a href=>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/utilities/AnimalShelter.java>Code<a/>





## Class 11 Code Challenge - Queue with Stacks

#### Summary

I whiteboarded and solved this issue presented to me through research and inquiries to TA James and my fellow classmates.

#### Challenge Description

The feature task was listed as: Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects.

#### Approach & Efficiency

Using testing and system out print lines, I created methods specifically tailored to the feature tasks of this lab.

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/assets/PsuedoQueue.jpg>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/tree/master/challenges/src/main/java/stacksandqueues>Code<a/>

#### Credits
My classmate Daisy and <a href=https://coderbyte.com/algorithm/implement-queue-using-two-stacks>Coderbyte</a> helped me complete this challenge.





## Lab 10 - Stack and Queue Implementation

#### Summary

First assigment with Stacks and Queues.

#### Challenge Description

Create Stack class and Queue class that work.

#### Approach & Efficiency

Using testing and system out print lines, I created methods specifically tailored to the feature tasks of this lab.

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/tree/master/challenges/src/main/java/stacksandqueues>Code<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/tree/master/challenges/src/test/java/stacksandqueues>Tests<a/>

#### Credits

My TA James assisted me throughout this lab.





## Class 8 Code Challenge - Merge Lists

#### Summary

I whiteboarded (on paper) and solved this issue presented to me through research and inquiries.

#### Challenge Description

The feature task was listed as: Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

#### Approach & Efficiency

I first sought out the assistance of my TA, James, who gave me great advice to go off of. after i had been working at it for a while, I browsed the internet looking for any useful pointers. After that, it was basically trial and error.

#### Solution

<a href=>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/kth/LinkedList.java>Code<a/>

#### Credits

<a href=https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/>Geeks for Geeks</a> was a huge help to me in solving this challenge, as well as my TA James.





## Class 7 Code Challenge - kth value from the end of a linked list

#### Summary

I whiteboarded (on paper) and solved this issue presented to me through research and inquiries.

#### Challenge Description

The feature task was listed as: write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

#### Approach & Efficiency

Through research and dedication, I wrote out what I was going to do (whiteboard method) and I researched and asked quetions when needed.

#### Solution

<a href=>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/kth/LinkedList.java>Code<a/>

#### Credits

I flew solo on this project.





## Class 6 Code Challenge - Linked List Insertions

#### Summary

Myeslf and my partner for this assignment (Micah) whiteboarded and solved this issue presented to us through collaboration and research.

#### Challenge Description

Problem domain was to find a way to insert a node into an array in three seperate methods.

#### Approach & Efficiency

Through research and teamwork, a plan was devised via whiteboard to complete this challenge.

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/assets/06-whiteboard.jpg>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/linkedlist/LinkedList.java>Code<a/>

#### Credits

My partner Micah from class assisted me with this project.





## Lab 05

#### Summary
First assigment with linked lists.

#### Challenge Description
Problem domain was to create a method to instantiate a Linked List, a method to add into the Linked List, and a method to return a string including the values of the nodes in the Linked List. Also, tests needed to be created to verfiy the methods worked.

#### Approach & Efficiency
Through research and TA James assistance, I was able to work through problems I ran into while coding and learn more about Linking Lists.

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/linkedlist/LinkedList.java>Code<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/test/java/linkedlist/LinkedListTest.java>Tests<a/>

#### Credits
TA James assisted me with my understanding of this Lab as well as https://www.geeksforgeeks.org/.





## Challenge 3

#### Summary
Myeslf and my partner for this assignment (Greg) whiteboarded and solved this issue presented to us through collaboration and research.

#### Challenge Description
Problem domain was to find a way to locate a specific element within an array (Integer).

#### Approach & Efficiency
Through research and teamwork, a plan was devised via whiteboard to complete this challenge. Constant communication was paramount in the completion of this challenge.

#### Solution

<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/assets/Day3.jpg>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/challenges/BinarySearch.java>Code<a/>

#### Credits
My partner Greg and Instructor Nicholas from class assisted me with this project as well as https://www.javatpoint.com/binary-search-in-java, https://www.tutorialspoint.com/java/util/arrays_binarysearch_int.htm, https://www.geeksforgeeks.org/binary-search/.





## Challenge 2

#### Summary
Myeslf and my partner for this assignment (Mattäus) whiteboarded and solved this issue presented to us through collaboration and research.

#### Challenge Description
Problem domain was to find a way to insert an integer into the middle of an array of integers.

#### Approach & Efficiency
Through research and teamwork, a plan was devised via whiteboard to complete this challenge.

#### Solution
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/assets/Day2.jpg>Whiteboard<a/>
  
<a href=https://github.com/Gr8-Dayne/401-Data-Structures/blob/master/challenges/src/main/java/challenges/ArrayShift.java>Code<a/>

#### Credits
Michelle, Mattäus and Greg from class assisted me with this project as well as geeksforgeeks.org and codescracker.com.


