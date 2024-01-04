# Rule 5: Remove all non dominants

num_list = [1, 2, 3, 4, 5, 6, 7]

def randomFunction(num_list):
    total = 0                   # assignment: O(1)
    all_integer = True          # assignment: O(1)

    for num in num_list:
        print(num)              # depend on input: O(n)

    for num1 in num_list:       
        for num2 in num_list:   
            print(num1, num2)   # nested loop: O(n^2)
            total += 1          # nested loop: O(n^2)

    msg = "Rule 5: Remove all non dominants"    # assignment: O(1)
    return total;                               # assignment: O(1)

print(randomFunction(num_list))     # O(4 + 2n + 2n^2)
                                    # --> apply Rule 3: O(n + n^2)
                                    # --> apply Rule 5: O(n^2) is the complexity