# Data Structures

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
- Integer Reversion Exercise: [`Exercise4.java`](java/arrays/Exercise1.java) [`Example4.java`](java/arrays/Example1.java)