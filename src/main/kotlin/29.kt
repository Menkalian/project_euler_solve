import java.math.BigInteger

fun main(){
    val list = mutableListOf<BigInteger>()
    for(a in 2L..100){
        for(b in 2..100){
            val temp = BigInteger.valueOf(a).pow(b)
            if(!list.contains(temp)){
                list.add(temp)
            }
        }
    }
    println(list.size)
}