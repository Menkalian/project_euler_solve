import utils.Factorizer

val factorizer = Factorizer()

fun main(){
    var triangle = 0L

    for(i in 1L..Long.MAX_VALUE){
        triangle += i
        val nof = numberOfDivisors(triangle)
        if(nof >= 500L){
            println("The ${i}th triangular Number is $triangle. It has $nof divisors!")
            return
        }
    }
}

fun numberOfDivisors(triangle: Long): Long {
    val facList = factorizer.factorList(triangle)

    facList.removeAt(0)

    val map = mutableMapOf<Long,Long>()

    for(f in facList){
        if(map.containsKey(f)){
            val g = map[f]?.plus(1)
            if (g != null) {
                map.remove(f)
                map[f] = g
            }
        }else
            map[f] = 1
    }

    var toRet = 1L

    for(e in map.values){
        toRet *= (e+1L)
    }

    return toRet
}
