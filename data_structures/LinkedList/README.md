## Linked Lists

- aim is to store items effeciently (insertion and removal operations)

### Singly Linked List

![Alt text](<../../assets/singly-linked-list.png>) <br>

- we have access to the first node of the linked list (Head), and other items can be accessed starting with this node. Each node is pointing to the next node until end.
- last node (Tail) is pointing to a null value.
- every node stores the **data** itself and a **reference** to the next node in the linked list data structure. This is why linked lists require more memory than arrays.
- has an advantage: there cannot be holes in the data structure, so there is no need for shifting items, since we are using linkes between the items.
- **no random indexing** as the items are not stored next to each other in the memory.
- Complexity with Linked List:
    - to find an arbitrary item in linked list, still has **O(n)** running time complexity.
    - manipulating an arbitrary item: **O(n)** linear running time complexity

|                                | Access    | Search    | Insert    | Delete    |
|--------------------------------|-----------|-----------|-----------|-----------|
| manipulating an arbitrary item |   O(n)    |   O(n)    |   O(n)    |   O(n)    |
| manipulating the first item    |   O(1)   *|   O(1)   *|   O(1)   *|   O(1)   *| 

- Pros and Cons of Singly Linked Lists

![Alt text](<../../assets/pros-and-cons-singly-linked-list.png>) <br>

### Singly Linked lists in Java !!!

- In a singly linked list we store a reference to the first node (head node) exclusively. Which means that if we want to insert items to the end of the linked list then we have to iterate through the list first - this is why it takes O(N) running time.
- **BUT IN JAVA'S LINKED LIST, THERE IS A REFERENCE TO THE LAST NODE OF THE LINKED LIST AS WELL !!!**
- It means of course that inserting items to the end of the linked list (and removing items from the end of a linked list) takes O(1) constant running time complexity.

[`simple-integer-linkedlist`](../LinkedList/java/simple_integer_linkedlist/)
[`generic-linkedlist`](../LinkedList/java/generic_linkedlist/)

#### Arrays Vs LinkedLists

|            Arrays            |          LinkedLists           |
|------------------------------|--------------------------------|
| Static Data Structure        | Dynamic Data Structure         |
| Random access (indexes)      | No Random access               |
| Manipulate first item O(n) - have to shift several items | Manipulate first item - update the references      |
| Manipulate last item -  there cannot be holes            | Manipulate last item - traverse whole list O(n) |
| Memory management - do not need extra memory             | Memory management - need extra memory(references)    |

- searching (removing) an arbitrary item (when we do not know the index of the item: arrays) takes O(n) linear running time complexity - **main disadvantage** of arrays and linked lists.


### Singly Linked lists in Python !!!

[`singly_linked_list.py`](../LinkedList/python/linkedlist/singly_linked_list.py)

### Doubly Linked List

[`doubly-linked-list`](../LinkedList/java/doubly_linked_list/)

![Alt text](<../../assets/doubly-linked-list.png>) <br>

### Java's built-in LinkedList data structure

- https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
- **Doubly-linked list implementation** of the List and Deque interfaces. Implements all optional list operations, and permits all elements (including null). Allows addFirst(E e), addLast(E e) which has O(1).

### Circular Linked List


### Linked lists real world applications:

 - low level memory management (heap management)
 - applications of Windows OS: several tabs (applications) opened, alt+tab
 - photo viewer application - next photo, prev photo
 - blockchains (BitCoin) - blocks are cryptographically linked together by hash values