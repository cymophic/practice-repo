numberList = [1, 2, 3, 4 ,5 ,-6, 7, -8]

containsNegative : bool = any(number < 0 for number in numberList)

print(f'\n{numberList}')
print(f'The list contains a negative number. True or False? ')
print(f'\n{containsNegative}\n')