import java.math.BigInteger

fun main() {
    val two = BigInteger.ONE + BigInteger.ONE
    var i = BigInteger.ONE

    for (e in 0..999){
        i *= two
    }
    println(i.toString(10))
    var sum = BigInteger.ZERO

    while(i >= BigInteger.ZERO){
        sum += i% BigInteger.TEN
        i /= BigInteger.TEN
    }

    println(sum)

}