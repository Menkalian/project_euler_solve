import utils.getPrimesTill

fun main(){
    val list = getPrimesTill(2000000L)
    var sum = 0L
    for(it in list)
        sum += it

    println(sum)
}