fun main(){
    val pH = PentagonHelper()
    var record = Long.MAX_VALUE
    for(i in 1..Int.MAX_VALUE) {
        for(j in 1..i){
            val sum = pH.getIthPentagonal(i) + pH.getIthPentagonal(j)
            val diff = Math.abs(pH.getIthPentagonal(i) - pH.getIthPentagonal(j))
            if(pH.isPentagonal(sum) && pH.isPentagonal(diff))
                if(diff < record) {
                    record = diff
                    println(record)
                }
            val d = Math.abs(pH.getIthPentagonal(i) - pH.getIthPentagonal(i-1))
            if(d > record) {
                println(record)
                return
            }
        }
    }
}

class PentagonHelper{
    val values = mutableListOf(1L)
    var current = 1

    fun getIthPentagonal(j: Int): Long {
        if(j == 0) return 0L

        while (values.size < j)
            calculateNextPentagon()

        return values.get(j-1)
    }

    fun isPentagonal(p: Long): Boolean {
        while (values.last() < p)
            calculateNextPentagon()

        return values.contains(p)
    }

    private fun calculateNextPentagon() {
        current++
        values.add(current*(3L*current-1L)/2L)
    }
}