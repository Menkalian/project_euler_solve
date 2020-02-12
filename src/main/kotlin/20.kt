import java.math.BigInteger

fun main(){
    var fact = BigInteger.ONE
    var add = BigInteger.ONE
    for(i in 1..100) {
        fact *= add
        add += BigInteger.ONE
    }
    println(fact.toString(10))
}