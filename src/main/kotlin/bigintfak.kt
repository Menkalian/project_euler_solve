import java.math.BigInteger

fun fak(of: BigInteger): BigInteger {
    var prod = BigInteger.ONE
    var count = BigInteger.ONE

    while (count.compareTo(of) <= 0) {
        prod *= count
        count++
    }

    return prod
}

fun main(){
    val fak_1 = fak(BigInteger.valueOf(8870))
    val fak_2 = fak(BigInteger.valueOf(670))
    val fak_3 = fak(BigInteger.valueOf(8200))

    println("8870! = " + fak_1.toString(10) + "\n\n")
    println("670! = " + fak_2.toString(10) + "\n\n")
    println("8200! = " + fak_3.toString(10) + "\n\n")

    println("REsult: "+(fak_1/(fak_2*fak_3)).toString(10))
}