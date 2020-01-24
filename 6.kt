fun main() {
    var squareOfSum = 0L
    for(i in 1..100)
        squareOfSum += i
    squareOfSum *= squareOfSum
    println("Square of the Sum 1-100: $squareOfSum")

    var sumOfSquares = 0L
    for(i in 1..100)
        sumOfSquares += i*i
    println("Sum of the Squares 1-100: $sumOfSquares")

    val diff = sumOfSquares-squareOfSum
    println("Difference: $diff")
}