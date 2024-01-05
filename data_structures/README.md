# Data Structures

- A **data structure** is a particular way of **organizing** data in a computer so that it can be used **effectively**. (enables efficient **access** and **modification**)

 ![Alt text](<../assets/data_structures_category.png>) <br>

## Arrays

| Operation                            | Running Time Complexity |
|--------------------------------------|-------------------------|
| access based on index                |     **O(1)** constant   |
| update based on index                |     O(1) constant       |
| search based on index                |     O(1) constant       |
| search for arbitrary item (no index) |     **O(N)** linear     |
| traversing (visiting every item)     |     O(N) linear         |
| copying the complete array into      |                         |
|                   new memory address |     O(N) linear         |
| insert item to the end of array      |     O(1) constant       |  
| insert item to arbitrary position    |     **O(N)** linear     |
| remove/ delete last item             |     O(1) constant       |
| remove/ delete first item            |                         |
|        as copy items to fill the gap |     O(N) linear         |            
| remove item from arbitrary position  |                         |
|        as copy items to fill the gap |     **O(N)** linear     | 

- static array: arr = [100, 210, 300], inserting 400 into 
    first: arr = [400, 100, 210, 300]
    middle: arr = [100, 210, 400, 300]
    end: arr = [100, 210, 300, 400]
  complexity is O(N), as it will copy the entire array into another memory location.

- **dynamic arrays**: memory allocation depends on smallest power of 2, that is just greater or equal to the length of our array. Ex: If we have 3 elements in the array, we reserve space for 4 elements. 
- In dynamic arrays, our system allocates extra number of memory slot than we require, you can freely append the array for a certain limited size, and once we exhaust the freely available space, then only our system is going to copy, but again provide extra space, according to the current number of values in the array.
- So, Complexity for insert in dynamic array, is O(1) or O(N) depending on the situation. O(N) is only for edge cases.
 ![Alt text](<../assets/dynamic_array_memory_allocation.png>) <br>

### Example code

[`Array.java`](java/arrays/Array.java)
[`ArrayListDemo.java`](java/arrays/ArrayListDemo.java)

- In C, C++ or Java: Static - fixed number of memory slots. Have to give array size when creating.
- In Python, Javascript: Dynamic - flexible number of memory slots. By default dynamic array.
- Can store data only with same data type.
- 4 common operations in Arrays: **Access**, **Search**, **Insert**, **Delete**.
- Complexities to remember: **Average case scenario** and **Worst case scenario**.
- **Random Indexing**: accessing items based on the indexes is the main advantage of array data structure. **Random Access**: items are located right next to each other, so we can get them with the help of index, in constant running time complexity, O(1).
- memory address of the array is pointing to the beginning of the array.
    - Ex: an integer array with 5 elements stored like, If integer size is 32 bit, 4 bytes <br>

        memory address = array's address + index * data size (4 bytes) 
  
     ![Alt text](<../assets/array_in_memory.png>) <br>

### Interview questions

- Reverse Array Problem: [`Exercise1.java`](java/arrays/Exercise1.java) [`Example1.java`](java/arrays/Example1.java)
    - keep running the algorithm while lowIndex < highIndex
    - in every iteration, have to swap the items ith the index lowIndex and highIndex
    - in every single iteration, have to increment lowIndex and decrement the highIndex
- Anagram Problem: [`Exercise2.java`](java/arrays/Exercise2.java) [`Example2.java`](java/arrays/Example2.java)
    - Anagram is a phrase or word formed by rearranging the letters of a different word (subject) or phrase, using all the original letters exactly once. EX: restful - fluster
    - sort the letters/charactors in both strings in alphabetical order
    - iterate through the strings, check the letters are matching or not.
- Palindrome Problem: [`Exercise3.java`](java/arrays/Exercise3.java) [`Example3.java`](java/arrays/Example3.java)
    - A palindrome is a string that reads the same forward and backward. Ex: radar
    - take 2 pointers as forward index and backward index
    - iterate while forward index is less than backward index
    - if value in forward index is not equal to value in backward index, return false
    - increment forward index and decement backward index
    - after iteration, return true
- Integer Reversion Exercise: [`Exercise4.java`](java/arrays/Exercise1.java) [`Example4.java`](java/arrays/Example1.java)


## Linked Lists