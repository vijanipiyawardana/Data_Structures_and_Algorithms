import time
time.time()

# timestamp1 = time.time()
timestamp1 = time.time() * 1000  # Multiply by 1000 to get milliseconds

# Sum of natural numbers upto num
num = 100
if num < 0:
    print("Enter a positive number. ")
else:
    sum = 0
    # use while loop to iterate until 0
    while( num > 0):
        sum += num
        num -= 1
    print("The sum is :", sum)

### Program completed ###

# timestamp2 = time.time()
timestamp2 = time.time() * 1000  # Multiply by 1000 to get milliseconds

print("Execution time: ", timestamp2 - timestamp1)