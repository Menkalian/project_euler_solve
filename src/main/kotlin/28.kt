import java.math.BigInteger

fun main(){
    var sum = BigInteger.ONE
    var curr = BigInteger.ONE
    for (i in 1L..500L){
        for(j in 1..4){
            curr += BigInteger.valueOf(2L*i)
            println(curr)
            sum += curr
        }
    }
    println(sum.toString(10))
}