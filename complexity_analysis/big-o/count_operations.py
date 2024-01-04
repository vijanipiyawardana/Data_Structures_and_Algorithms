# operation: assigning, complexity: O(1)
students = ["Luke", "Atufa", "Vijani", "Marcus", "Ibrahim", "Anastasia", "Ariel", "Nate", "Layla"]

def randomFunction(students):
    first = students[0]     # operation: assigning, complexity: O(1)
    total = 0               # operation: assigning, complexity: O(1)
    new_list = []           # operation: assigning, complexity: O(1)

    # inside a loop, everything depends on size of the input: N
    for student in students:    
        total += 1                  # O(N)
        new_list.append(student)    # O(N)
    
    print(new_list)     # O(1)
    return(total)       # O(1)

print(randomFunction(students))     # O(6 + 2N) --> O(N) is the complexity if this program
