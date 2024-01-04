items = [2, 3, 4, 5, 6, 7]      
# input with 6 elements 
# in space complexity, the space required for input is not calculated

def display_cube(items):
    result = pow(items[0], 3)   # O(1), one extra variable: result, depend on one input
    print(result)

display_cube(items)

# space complexity is O(1), its constant even number of inputs is increased


#===============================================================================

def all_cubes(items):
    result = [];                        # extra memory

    for item in items:
        result.append(pow(item, 3))     # O(n), iterate through list and storing its result, 
                                        # output depends on number of inputs

    print(result)

all_cubes(items)

# space complexity is O(n)
