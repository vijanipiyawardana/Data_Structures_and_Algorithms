import time
time.time()

# timestamp1 = time.time()
timestamp1 = time.time() * 1000  # Multiply by 1000 to get milliseconds

### Python program to find the sum of n natural numbers ###
number = 100
total = 0

for value in range(1, number + 1):
    total = total + value

print("The sum is :", total)

### Program completed ###

# timestamp2 = time.time()
timestamp2 = time.time() * 1000  # Multiply by 1000 to get milliseconds

print("Execution time: ", timestamp2 - timestamp1)