import java.lang.Math.pow

fun main(){
    var sum = 0
    for(i in 2..Int.MAX_VALUE){
        if(digitPow(i) == i.toLong()){
            sum += i
            println(i)
        }
    }
    println(sum)
}

fun digitPow(i: Int): Long{
    var k = i
    var toRet = 0L
    while(k>0){
        toRet += pow((k%10).toDouble(), 5.0).toLong()
        k/=10
    }
    return toRet
}