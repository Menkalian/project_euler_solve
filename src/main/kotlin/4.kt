import kotlin.math.pow
import kotlin.math.roundToInt

fun powerOf10(number: Int): Int {
    var power = 0
    while (number / 10.0.pow(power.toDouble()) > 1)
        power++
    return power - 1
}

fun checkPalindrome(number: Int): Boolean {
    val power = powerOf10(number)
    var b = true
    for (i in 0..(power / 2.0).roundToInt()) {
        val n1: Int = (number / 10.0.pow((power - i).toDouble())).toInt() % 10
        val n2: Int = (number / 10.0.pow((i).toDouble())).toInt() % 10
        b = b && n1 == n2
        if (!b)
            return b
    }
    return b
}

fun main() {
    var record = 0
    for (i in 100..999) {
        for (j in 100..999) {
            val prod = i * j
            if (prod > record && checkPalindrome(prod)) {
                record = prod
                println("New record: $i * $j = $prod")
            }
        }
    }
    println(record)
}