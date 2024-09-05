import time

def InputError():
    print("Invalid input detected.")

def ClearTerminal():
	print("\033[H\033[J")

print("\nHello, User!")
time.sleep(1.0)

print("1 = Current")
time.sleep(0.2)
print("2 = Voltage")
time.sleep(0.2)
print("3 = Power")
time.sleep(0.2)

choice = input("\nWhat would you like to calculate?: ")

if choice == "1" or choice.casefold() == "current":
    print("Current")
elif choice == "2" or choice.casefold() == "voltage":
    print("Voltage")
elif choice == "3" or choice.casefold() == "power":
    print("Power")
else:
    InputError()