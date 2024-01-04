# Rule 4: consider different variable for different input

num_list = [1, 2, 3, 4, 5, 6, 7]
char_list = ['a', 'b', 'c', 'd', 'e']

def randomFunction(num_list, char_list):

    for num in num_list:
        print(num)      # O(n)

    for char in char_list:
        print(char)     # O(m)

randomFunction(num_list, char_list)      # O(n + m) but, 

################################################################################

num_list = [1, 2, 3, 4, 5, 6, 7]

def randomFunction(num_list, char_list):

    for num in num_list:
        print(num)      # O(n)

    for num in num_list:
        print(num)      # O(n)

randomFunction(num_list, char_list)      # O(n + n) -> O(2n) -> O(n) Rule 3 