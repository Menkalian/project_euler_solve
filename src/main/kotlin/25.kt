import java.math.BigInteger

fun main(){
    var v1 = BigInteger.ONE
    var v2 = BigInteger.ONE
    var count = 2L
//    println("F1 = $v1")
//    println("F2 = $v2")

    while (true){
        val temp = v1 + v2
        v1 = v2
        v2 = temp
        count++
       // println("F$count = $v2")
        if(v2.toString(10).length >= 1000){
            println(v2.toString(10))
            println(count)
            return
        }
    }
}