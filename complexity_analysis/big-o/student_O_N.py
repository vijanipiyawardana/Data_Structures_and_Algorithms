# Linear Complexity O(N)

student_list_1 = ["Luke", "Atufa", "Vijani", "Marcus"]

student_list_2 = ["Ibrahim", "Anastasia", "Ariel", "Nate", "Marcus"]

# calculate big-O for this: consider number of operations and number of inputs
# number of inputs = 4 (4 names in the list)
# number of operaions = 4 (we compare name is equal to Nate for each input)
# we consider worst case scenario: "Nate" is the last element of input. Rule 2 applies here.
def checkStudent(student_list):
    for student in student_list:
        if student == "Nate":
            print("Available")

checkStudent(student_list_1)
checkStudent(student_list_2)

# if number of inputs is 4, there are 4 operations
# if number of inputs is 5, there are 5 operations
# if number of inputs is N, there are N operations
# (eventhough the name is found in the middle of the list, the loop still goes until end of the list)
# if you draw a graph for this, the pattern is linear.
# (if the number of inputs is equal to number of operations, it follows a linear pattern)
# So, the complexity is O(N)