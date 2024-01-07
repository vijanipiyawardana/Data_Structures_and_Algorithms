# structure of the node
class Node:
    def __init__(self, value=None, next=None):      # constructor, default values
        self.value = value
        self.next = next


class LinkedList:
    def __init__(self):     # constructor
        self.head = None    # no object, no nodes in the LinkedList

    def insert():           # methods inside LinkedList
        pass
    
    def delete():
        pass


# create few node objects
n1 = Node(3)
n2 = Node(7)
n3 = Node(2)
n4 = Node(9)

# initialize the LinkedList and add the head as n1, and connect each other node
LL = LinkedList()   # initialize the LinkedList with empty head
LL.head = n1        # connect n1 as head

# here, head.next and n1.next are the same.
# connect the other nodes
n1.next = n2    # same as, LL.head.next = n2
n2.next = n3    # same as, LL.head.next.next = n3
n3.next = n4
# by default n4.next is assigned to None.
# instead of doing these manually (to insert nodes), create a method called insert in the LinkedList


