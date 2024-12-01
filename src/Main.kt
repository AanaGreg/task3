//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Please enter three numbers")
    print("Enter first number: ")
    val firstNumber = readLine()!!.toInt()
    print("Enter second number: ")
    val secondNumber = readLine()!!.toInt()
    print("Enter third number: ")
    val thirdNumber = readLine()!!.toInt()

    var largestNumber = if (firstNumber > secondNumber) firstNumber else secondNumber
    largestNumber = if (largestNumber > thirdNumber) largestNumber else thirdNumber
    println("The largest number is $largestNumber")
}
