# Data Structures and Algorithms

## Complexity Analysis [`complexity_analysis`](complexity_analysis)

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


## Data Structures [`data_structures`](data_structures)

- Why data structures?
    - to handle large amounts of data efficiently (ex: insert, delete, update, retrieve, search, sort)
    - modern applications and software are manipulating large amounts of data (ex: facebook, google, apple)
    - can tune the running time complexity of given algorithms by using the appropriate data structure.
    - ex: while **retrieving** value, **array** is better than **linked list**, while **deleting** value, **linked list** is better than **array**

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