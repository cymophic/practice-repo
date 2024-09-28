import time

def InputError():
    print("Invalid input detected.")

def ClearTerminal():
	print("\033[H\033[J")
     
def CurrentCalculator():
    print("== Current Calculator ==")
    time.sleep(1.0)
    print("The formula for calculating current is charge (Q) ÷ time (T) .\n")

    time.sleep(0.7)
    q = input("Enter total charge: ")
    time.sleep(0.2)
    t = input("Enter time in seconds: ")
    i = int(q) / int(t)

    time.sleep(1.0)
    print(f"{q} coulomb/s ÷ {t} second/s = {i} ampere/s\n")
    print(f"The total current based on your input is {i} A\n")

def VoltageCalculator():
    print("== Voltage Calculator ==")
    time.sleep(1.0)
    print("The formula for calculating voltage is work (J) ÷ charge (C).\n")

    time.sleep(0.7)
    j = input("Enter total work done: ")
    time.sleep(0.2)
    c = input("Enter total charge: ")
    v = int(j) / int(c)

    time.sleep(1.0)
    print(f"{j} joule/s ÷ {c} coulomb/s = {v} volt/s\n")
    print(f"The total voltage based on your input is {v} V\n")

def PowerCalculator():
    print("== Power Calculator ==")
    time.sleep(1.0)
    print("The formula for calculating power is work (J) ÷ time (T).\n")

    time.sleep(0.7)
    j = input("Enter total work done: ")
    time.sleep(0.2)
    t = input("Enter time in seconds: ")
    w = int(j) / int(t)

    time.sleep(1.0)
    print(f"{j} joule/s ÷ {t} second/s = {w} watt/s\n")
    print(f"The total voltage based on your input is {w} W\n")


ClearTerminal()
print("Hello, User!")
time.sleep(1.0)

print("1 = Current")
time.sleep(0.2)
print("2 = Voltage")
time.sleep(0.2)
print("3 = Power")
time.sleep(0.2)

choice = input("\nWhat would you like to calculate?: ")

if choice == "1" or choice.casefold() == "current":
    ClearTerminal()
    CurrentCalculator()
elif choice == "2" or choice.casefold() == "voltage":
    ClearTerminal()
    VoltageCalculator()
elif choice == "3" or choice.casefold() == "power":
    ClearTerminal()
    PowerCalculator()
else:
    InputError()

