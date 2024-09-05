fun getListOfNumbers(): List<Int> {
  var myList = mutableListOf<Int>()
  for (i in 1..7) {
    print("Enter a number: ")
    val answer = Integer.valueOf(readLine())
    myList.add(answer)
  }
  return myList
}

fun findMax(numList: List<Int>): Int {
  var largestNumber = numList[0]
  for (num in numList) {
    if (num > largestNumber) largestNumber = num
  }
  return largestNumber
}

fun findMin(numList: List<Int>): Int {
  var smallestNumber = numList[0]
  for (num in numList) {
    if (num < smallestNumber) smallestNumber = num
  }
  return smallestNumber 
}

fun findAverage(numList: List<Int>): Int {
  var sum = 0
  for (num in numList) sum += num
  return sum / numList.size
}

fun checkIfListContains(numList: List<Int>, numToFind: Int): Boolean {
  for (num in numList) {
    if (num == numToFind) return true
  }
  return false
}

fun main() {
  var values = getListOfNumbers()
  var largestValue = findMax(values)
  var smallestValue = findMin(values)
  var average = findAverage(values)

  println("=======================")
  println(values)
  println("=======================")
  println("The largest number is [$largestValue]")
  println("The smallest number is [$smallestValue]")
  println("The average number is [$average]")
  println("=======================")
  print("What number would you like to find in the list?: ")
  var numToFind = Integer.valueOf(readLine())
  var containsValue = checkIfListContains(values, numToFind)
  if (containsValue == true) println("[$numToFind] was found in the list!")
  else println("[$numToFind] was never found in the list.")
  println("=======================")
}

