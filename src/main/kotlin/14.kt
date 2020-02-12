fun main() {
    var record = 0
    var recordInd = 0L

    for (i in 1L..1000000L) {
        val chainlen = chain(i)

        if (chainlen > record) {
            record = chainlen
            recordInd = i

            println("$recordInd produced a chain of length $record")
        }
    }

    println("$recordInd finished and produced a chain of length $record")
}

fun chain(num: Long): Int {
    var n = num
    var iter = 0
    while(n != 1L){
        if(n %2L == 0L) n /= 2L
        else n = 3L*n +1L
        iter++
    }
    return iter
}