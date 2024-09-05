class GCD:
	
	print("Hello! This is a calculator for finding GCD. \n")
	
	first = int(input("Enter the first number: "))
	second = int(input("Enter the second number: "))
	
	print("\nThe GCD of " + str(first) + " and " + str(second) + " is: ", end = "")

	while first != second:
		
		if(first > second):
			first = first - second
	
		elif(first < second):
			second = second - first
	
	if first == second:
		print(first)
		
		
	