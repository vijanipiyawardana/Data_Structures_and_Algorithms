# Data Structures and Algorithms

## Complexity Analysis

- How to define a good code?
    - Run fast
    - Require less memory
    - Readable
    - Gives correct output
- two factors for a good code: readability and scalablity
- scalable? speed (fast) and memory (less memory) to execute - Time dependent and Space dependent
- So, the vectors are: Time complexity and Space complexity
- Big O notation is the parameter to judge both points.

### Time complexity
- Amount of time it takes to run an algorithm
- Algorithm runs fast -> better time complexity

### Space complexity
- Amount of extra space our algorithm requires
- Algorithm takes less space -> better space complexity

### Big-O Notation
![Alt text](<Screenshot from 2024-01-03 03-10-54.png>)
- We use Big-O because we cannot depend on the clock time of the system. 
Ex: Write a program to calculate sum of n natural numbers. For example we will take n as 100.
[`SumForLoop.java`](complexity_analysis/SumForLoop.java) [`SumWhileLoop.java`](complexity_analysis/SumWhileLoop.java) [`SumForLoop.py`](complexity_analysis/SumForLoop.py) [`SumWhileLoop.py`](complexity_analysis/SumWhileLoop.py) <br>

| language | run platform |   method   | execution time (executed twice)       |
|----------|--------------|------------|---------------------------------------|
| Java     |    laptop    | for loop   | 20 milliseconds, 25 milliseconds      |
| Java     |    laptop    | while loop | 19 milliseconds, 35 milliseconds      |
| Python   |    laptop    | for loop   | 0.04150390625, 0.64404296875          |
| Python   |    laptop    | while loop | 0.06494140625, 0.105224609375         |
| Java     |    online    | for loop   | 46 milliseconds, 54 milliseconds      |
| Java     |    online    | while loop | 31 milliseconds, 30 milliseconds      |
| Python   |    online    | for loop   | 0.043212890625, 0.0390625             |
| Python   |    online    | while loop | 0.061279296875, 0.049072265625        |

## Data Structures [`data_structures`](data_structures)

- Why data structures?
    - to handle large amounts of data efficiently
    - modern applications and software are manipulating large amounts of data (ex: facebook)
    - can tune the running time complexity of given algorithms by using the appropriate data structure.

- Arrays [`arrays`](data_structures/java/arrays/)
- Linked Lists [`linked_list`](data_structures/java/LinkedList/)
- Doubly Linked Lists [`doubly_linked_list`](data_structures/java/DoublyLinkedList/)
- Stacks
- Queues
- Binary Search Trees
- Balanced Trees: AVL Trees
- Balanced Trees: Red-Black Trees
- Splay Trees
- Binary Heaps
- B-Trees
- Hash Tables
- Tries
- Graphs

## Algorithms [`algorithms`](algorithms)

- Basic Sorting Algorithms
- Advanced Sorting Algorithms
- Searching Algorithms
- Tree Traversals
- Graph Traversals

## Abstract Data Types (ADTs)

- define the model (logical description) for a certain data structure
- like a supertype in programming (interface or abstract classes)
- defines the basic behaviour, do not specify the implementation or the programming language, etc
- **Abstract Data Types define the behaviour without the implementation** ex: stack, queue
- **Data Structures are the concrete representation and implementations of the underlying data** ex: arrays, linked lists, with which we can implement ADS like stack or queue, **and to achieve as fast running time as possible**