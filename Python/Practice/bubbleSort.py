def BubbleSort(numList):
    listSize = len(numList)
    for currentIndex in range(listSize): # goes through the whole list
        for unsortedIndex in range(0, listSize - currentIndex - 1): # iterate through unsorted parts of list only
            # if currentNumber > frontNumber
            if numList[unsortedIndex] > numList[unsortedIndex + 1]: 
                # newPosition = oldPosition (exchange positions)
                numList[unsortedIndex], numList[unsortedIndex + 1] = numList[unsortedIndex + 1], numList[unsortedIndex] 

def Clear():
	print("\033[H\033[J")

nums = [100, 1, 1000, 500]
newNums = list(nums)
BubbleSort(newNums)
Clear()
print("Original List:", nums)
print("Sorted List:", newNums, "\n")