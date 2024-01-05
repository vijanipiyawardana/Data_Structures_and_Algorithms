# Data Structures

- A **data structure** is a particular way of **organizing** data in a computer so that it can be used **effectively**. (enables efficient **access** and **modification**)

 ![Alt text](<../assets/data_structures_category.png>) <br>

## Arrays

| Operation                            | Running Time Complexity |
|--------------------------------------|-------------------------|
| search based on index                |     O(1) constant       |
| search for arbitrary item (no index) |     O(N) linear         |
| insert item to the end of array      |     O(1) constant       |
| insert item to arbitrary position    |     O(N) linear         |
| remove last item                     |     O(1) constant       |
| remove item from arbitrary position  |     O(N) linear         |

[`Array.java`](java/arrays/Array.java)
[`ArrayListDemo.java`](java/arrays/ArrayListDemo.java)

- In C, C++ or Java: Static - fixed number of memory slots. Have to give array size when creating.
- In Python, Javascript: Dynamic - flexible number of memory slots. By default dynamic array.
- 4 common operations in Arrays: **Access**, **Search**, **Insert**, **Delete**.
- Complexities to remember: **Average case scenario** and **Worst case scenario**.
- memory address of the array is pointing to the beginning of the array.
    - Ex: an integer array with 5 elements stored like, If integer size is 32 bit, 4 bytes <br>

        .----------------------------------------------------------------.<br>
        | memory address = array's address + index * data size (4 bytes) |<br>
        '----------------------------------------------------------------'<br>
    
     ![Alt text](<../assets/array_in_memory.png>) <br>

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