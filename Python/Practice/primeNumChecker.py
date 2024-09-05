import math

def isPrime(num):
    # Checks if number is 2
    if num == 2 :
        return True
    # Checks if number is less than 2
    if num < 2 :
        return False
    # Checks if number is divisible by 2
    elif num % 2 == 0:
            return False
    # Calculates the square root of the number and check for factors from 3 up to (but not including) the square root.
    # Only odd numbers are checked as factors since even numbers (other than 2) cannot be prime.
    # If a factor is found, the number is not prime.
    squareRoot = int(math.sqrt(num)) + 1
    for n in range (3, squareRoot, 2):
        if num % n == 0:
            return False
    
    return True
    

num = int(input("Please enter a number: "))

if isPrime(num) == True:
    print("The number is a prime number.")
else:
    print("The number is not a prime number.")


    