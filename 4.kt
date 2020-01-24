fun powerOf10(number: Int): Int {
    var power = 0
    while (number / Math.pow(10.0, power.toDouble()) > 1)
        power++
    return power - 1
}

fun checkPalindrome(number: Int): Boolean {
    val power = powerOf10(number)
    var b = true
    for (i in 0..Math.round(power / 2.0)) {
        var n1: Int = (number / Math.pow(10.0, (power - i).toDouble())).toInt() % 10
        var n2: Int = (number / Math.pow(10.0, (i).toDouble())).toInt() % 10
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