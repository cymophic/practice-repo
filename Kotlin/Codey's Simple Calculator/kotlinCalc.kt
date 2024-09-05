class Calculator (val name: String) {
    init {
      println("Owner: $name")
    }
    fun Add(num1: Int,  num2: Int) = num1 + num2
    fun Subtract(num1: Int,  num2: Int) = num1 - num2
    fun Multiply(num1: Int,  num2: Int) = num1 * num2
    fun Divide(num1: Int,  num2: Int) = num1 / num2
    fun Power(num1: Int,  num2: Int): Int {
      var result = 1
      for (i in 1..num1) result *= num2
      return result
    } 
}
  
fun main() {
    var myCalc = Calculator("Codey")
    println("This is Codey's Kotlin Calculator")
    print("Input the first number: ")
    var firstNum = Integer.valueOf(readLine())
    print("Input the second number: ")
    var secondNum = Integer.valueOf(readLine())

    println(myCalc.Add(firstNum, secondNum))
    println(myCalc.Subtract(firstNum, secondNum))
    println(myCalc.Multiply(firstNum, secondNum))
    println(myCalc.Divide(firstNum, secondNum))
    println(myCalc.Power(firstNum, secondNum))
}