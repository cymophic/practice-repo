import time

red = "\033[91m"
green = "\033[92m"
yellow = "\033[93m"
blue = "\033[94m"
lightblue = "\033[96m"

bold = "\033[1m"
underline = "\033[4m"
italic = "\033[3m"
reset = "\033[0m"

def Add():
	print("Operation Used: " + yellow + bold + "Addition\n" + reset)
	firstNum = input("Enter your first number: ")
	if firstNum.isnumeric():
		print(yellow + bold + firstNum + " + __ = __ " + reset)
	else:
		time.sleep(0.7)
		InputError()
		return

	secondNum = input("\nEnter your second number: ")
	if secondNum.isnumeric():
		sum = int(firstNum) + int(secondNum)
		print(yellow + bold + str(firstNum) + " + " + str(secondNum) + " = " + str(sum) + reset)
	else:
		time.sleep(0.7)
		InputError()
		return

	print("\nThe answer is: " + str(sum))
	
def Sub():
	print("Operation Used: " + yellow + bold + "Subtraction\n" + reset)
	firstNum = input("Enter your first number: ")
	if firstNum.isnumeric():
		print(yellow + bold + firstNum + " - __ = __ "+ reset)
	else:
		time.sleep(0.7)
		InputError()
		return

	secondNum = input("\nEnter your second number: ")
	if secondNum.isnumeric():
		sum = int(firstNum) - int(secondNum)
		print(yellow + bold + str(firstNum) + " - " + str(secondNum) + " = " + str(sum)+ reset)
	else:
		time.sleep(0.7)
		InputError()
		return

	print("\nThe answer is: " + str(sum))

def Mul():
	print("Operation Used: " + yellow + bold + "Multiplication\n" + reset)
	firstNum = input("Enter your first number: ")
	if firstNum.isnumeric():
		print(yellow + bold + firstNum + " × __ = __ "+ reset)
	else:
		time.sleep(0.7)
		InputError()
		return

	secondNum = input("\nEnter your second number: ")
	if secondNum.isnumeric():
		sum = int(firstNum) * int(secondNum)
		print(yellow + bold + str(firstNum) + " × " + str(secondNum) + " = " + str(sum)+ reset)
	else:
		time.sleep(0.7)
		InputError()
		return

	print("\nThe answer is: " + str(sum))

def Div():
	print("Operation Used: " + yellow + bold + "Division\n" + reset)
	firstNum = input("Enter your first number: ")
	if firstNum.isnumeric():
		print(yellow + bold + firstNum + " ÷ __ = __ "+ reset)
	else:
		time.sleep(0.7)
		InputError()
		return

	secondNum = input("\nEnter your second number: ")
	if secondNum.isnumeric():
		sum = int(firstNum) / int(secondNum)
		print(yellow + bold + str(firstNum) + " ÷ " + str(secondNum) + " = " + str(sum)+ reset)
	else:
		time.sleep(0.7)
		InputError()
		return

def InputError():
	ClearTerminal()
	print(red + bold + "Invalid input detected." + reset)

def ClearTerminal():
	print("\033[H\033[J")

def LoadingAnimation():
	time.sleep(0.1)
	ClearTerminal()
	print("        ")
	ClearTerminal()
	print("|      |")
	time.sleep(0.1)
	ClearTerminal()
	print("||    ||")
	time.sleep(0.1)
	ClearTerminal()
	print("|||  |||")
	time.sleep(0.1)
	ClearTerminal()
	print("||||||||")
	time.sleep(0.1)
	ClearTerminal()
	print("|||  |||")
	time.sleep(0.1)
	ClearTerminal()
	print("||    ||")
	time.sleep(0.1)
	ClearTerminal()
	print("|      |")
	time.sleep(0.1)
	ClearTerminal()
	print("        ")
	time.sleep(0.1)
	ClearTerminal()

loopProgram = 1
while loopProgram == 1:
	LoadingAnimation()

	print("Hello. This is a " + green + bold + "4-function calculator.\n" + reset)
	time.sleep(1.0)

	print("1 = " + yellow + bold + "Addition" + reset)
	time.sleep(0.2)
	print("2 = " + yellow + bold + "Subtraction" + reset)
	time.sleep(0.2)
	print("3 = " + yellow + bold + "Multiplication" + reset)
	time.sleep(0.2)
	print("4 = " + yellow + bold + "Division" + reset)
	time.sleep(0.2)

	operation = input("\nWhat " + blue + bold + "operation " + reset + "would you like to use?: ")

	if operation == "1" or operation.casefold() == "addition":
		LoadingAnimation()
		Add()
	elif operation == "2" or operation.casefold() =="subtraction":
		LoadingAnimation()
		Sub()
	elif operation == "3" or operation.casefold() == "multiplication":
		LoadingAnimation()
		Mul()
	elif operation == "4" or operation.casefold() == "division":
		LoadingAnimation()
		Div()
	else:
		InputError()

	proceed = 1
	while proceed == 1:
		time.sleep(0.8)
		retry = input(blue + bold + "\nWould you like to try again? [Y/N]: " + reset)
		if retry.casefold() == "y":
			proceed = 0
			ClearTerminal()
		elif retry.casefold() == "n":
			proceed = 0	
			ClearTerminal()
			time.sleep(0.7)
			print(green + bold + "Thank you and have a nice day.\n" + reset)
			loopProgram = 0
		else:
			InputError()