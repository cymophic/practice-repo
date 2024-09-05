import time

class PNF:
	print("Hello! This is a prime number finder.")
	print("Enter two numbers and the program will output all the prime numbers in between.\n")
	time.sleep(1.2)
	
	lower = int(input("Enter the lower number: "))
	upper = int(input("Enter the upper number: "))
	print("\nThe prime numbers in between " + str(lower) + " and " + str(upper) + " are:")

	for num in range(lower, upper + 1):
		if num > 1:
			for i in range(2, num):
				if num % i == 0:
					break
			else:
				print(num, end = " ", flush = True)