fun bubbleSort(numList: MutableList<Int>) {
    val listSize = numList.size
    for (currentIndex in 0 until listSize) { // goes through the whole list
        for (unsortedIndex in 0 until listSize - currentIndex - 1) { // check unsorted part only
            // if currentNumber > frontNumber
            if (numList[unsortedIndex] > numList[unsortedIndex + 1]) {
                // newPosition = oldPosition (exchange positions)
                val oldIndex = numList[unsortedIndex]
                numList[unsortedIndex] = numList[unsortedIndex + 1]
                numList[unsortedIndex + 1] = oldIndex
            }
        }
    }
}

fun clear() {
    print("\u001b[H\u001b[J")
}

fun main() {
    val nums = mutableListOf(100, 1, 1000, 500)
    val newNums = ArrayList(nums)
    bubbleSort(newNums)
    clear()
    println("Original List: $nums")
    println("Sorted List: $newNums\n")
}