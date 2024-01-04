num_list = [1, 2, 3, 4, 5, 6, 7]

def randomFunction(num_list):
    total = 0

    # select one element in the list, and inside the loop, consider all elements in the list
    # quadratic: 2 elements 4 operations, 3 elements 9 operations
    # nested loop
    for num1 in num_list:       
        for num2 in num_list:   
            print(num1, num2)
            total += 1

    return total;

print(randomFunction(num_list))     # O(N^2)


================================================================================
num_list1 = [1, 2, 3, 4, 5, 6, 7]
num_list2 = [5, 6, 7, 8, 9]

def randomFunction(num_list1, num_list2):
    total = 0

    # select one element in the list, and inside the loop, consider all elements in the list
    # quadratic: 2 elements 4 operations, 3 elements 9 operations
    # nested loop
    for num1 in num_list1:       
        for num2 in num_list2:   
            print(num1, num2)
            total += 1

    return total;

print(randomFunction(num_list1, num_list2)) # O(N*M) --> O(N^2) : Rule 4


