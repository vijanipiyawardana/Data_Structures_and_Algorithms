## Linked Lists

- aim is to store items effeciently (insertion and removal operations)
- we have access to the first node of the linked list (Head), and other items can be accessed starting with this node. Each node is pointing to the next node until end.
- last node (Tail) is pointing to a null value.
- every node stores the **data** itself and a **reference** to the next node in the linked list data structure. This is why linked lists require more memory than arrays.
- has an advantage: there cannot be holes in the data structure, so there is no need for shifting items, since we are using linkes between the items.
- **no random indexing** as the items are not stored next to each other in the memory.
- Complexity with Linked List:
    - to find an arbitrary item in linked list, still has **O(n)** running time complexity.
| Access    | Search    | Insert    | Delete    |
|-----------|-----------|-----------|-----------|
|   O(n)    |   O(n)    |   O(n)    |   O(n)    |
|     -     |     -     |   O(1)   *|   O(1)   *| 
    * manipulating the first item (insertion or removal)

### Singly Linked List

![Alt text](<../../assets/singly-linked-list.png>) <br>
![Alt text](<../../assets/doubly-linked-list.png>) <br>


### Doubly Linked List


### Circular Linked List
