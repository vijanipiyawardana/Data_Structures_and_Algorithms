# Complexity O(1)
# because this runs on constant time

student_list = ["Luke", "Atufa", "Vijani", "Marcus", "Ibrahim", "Anastasia", "Ariel", "Nate", "Layla"]

# 1 operation
# here the operation only depends on 1 element of the input, even though input has 9 elements
# the number of operations do not depend on input as we grow
# how big our input is, we do our task in constant time on a function
def displayStudent(student_list):
    print(student_list[0]) # O(1)

def displayStudent2(student_list):
    print(student_list[0]) # O(1)
    print(student_list[1]) # O(1)

displayStudent(student_list) # O(1)
displayStudent2(student_list) # O(1+1) = O(2), which is still constant