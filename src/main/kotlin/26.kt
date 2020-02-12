
fun main(){
    var record = 0
    var recordVal = 0
    for(i in 1..1000){
        val temp = calculateRecurringDepth(i)
        if(temp > record){
            record = temp
            recordVal = i
        }
    }
    println("$recordVal gets a periodic behaviour of length $record")
}

fun calculateRecurringDepth(i: Int): Int {
    val receivedResults : HashMap<Int, Int> = HashMap()
    var c = 1
    var count = 0
    while(c>0){
        if(c < i){
            c *= 10
        } else {
            c %= i
            count ++
            if(receivedResults.containsKey(c)){
                // Recurring Pattern found!!!
                return receivedResults.values.max()?.minus(receivedResults[c]!!)!!
            }
            receivedResults[c] = count
        }
    }
    return 0
}
