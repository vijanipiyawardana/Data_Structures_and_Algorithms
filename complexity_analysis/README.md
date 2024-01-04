# Complexity Analysis

### Big-O Notation

![Alt text](<../assets/big-o/big_o_intro.png>)

- We use Big-O because, we cannot depend on the clock time of the system. <br>
Ex: Write a program to calculate sum of n natural numbers. For example we will take n as 100.
[`SumForLoop.java`](SumForLoop.java) [`SumWhileLoop.java`](SumWhileLoop.java) [`SumForLoop.py`](SumForLoop.py) [`SumWhileLoop.py`](SumWhileLoop.py) <br>

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
- We use Big-O to give a performance rating to our program for time and space.
- Big-O doesn't depend on time, it depends on how many steps we are performing.
- The main focus is to calculate the amount of work we do or the number of comparisons we perform.
- if SolutionA has 10 operations and SolutionB has 5 operations, the SolutionB is going to perform better. We use complexity analysis because it depends on number of **Operations** and number of **Elements (inputs)**
- Big-O complexity chart - ratings <br>
![Alt text](<../assets/big-o/bigO_graph.png>)


### Complexity analysis example code
- [`O(n)`](big-o/student_O_n.py)
- [`O(1)`](big-o/student_O_1.py)
- [`count_operations`](big-o/count_operations.py) 
- [`simplifying_big_o_part1`](big-o/print_num_char)
- [`O(n^2)`](big-o/student_O_n^2.py)
- [`simplifying_big_o_part2`](big-o/loop_inside_loop.py)
- O(n!)
    - n factorial which is rare, impossible to write code for this in general.
    - because, adding a nested loop for every input element
    - scaled as horrible in the graph: worst complexity which is horrible

![Alt text](<../assets/big-o/bigO_simplify.png>)


## Space complexity

- Space Complexity of an algorithm represents the amount of extra memory space needed the algorithm in its life cycle.
- Usually we have 2 types of space requirements:
    - To store our input data
    - **Extra space that we need to execute our program**
- **How much additional memory do we need to allocate in order to run our code**
- Example code: [`display_cube`](space_complexity/display_cube.py)

# Memory

- 1 memory slot is **8 bit**, which is equal to **1 Byte**
- operating system either **32 bit** or **64 bit**
- in 32 bit OS, initialize an integer, it will take **32 bit**, which is equal to **4 Byte**
    - So, it will allocate 4 memory slots, stores the value in **Binary**,  
    - and returns a memory address in **Hexadecimal**, using that we can access the stored value
    - ex: to store arr = [2, 3] it should first find 8 memory slots all together, back to back
- to store strings, it use ASCII value
    ![Alt text](<../assets/memory/memory_canvas_array.png>)
    ![Alt text](<../assets/memory/memory_canvas_big_integer.png>)
    ![Alt text](<../assets/memory/memory_canvas_linked_list.png>)

# Logarithm

![Alt text](<../assets/logarithm/log_1.png>)
![Alt text](<../assets/logarithm/diff_val_for_diff_base.png>)
![Alt text](<../assets/logarithm/binary_log.png>)
![Alt text](<../assets/logarithm/log_base_2.png>)
