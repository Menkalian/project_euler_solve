fun main() {
Helper45().echoAllInAll()
}

class Helper45 {
    val triangleList = mutableListOf(1L)
    var triangleCount = 1
    val pentagonList = mutableListOf(1L)
    var pentaCount = 1
    val hexagonList = mutableListOf(1L)
    var hexaCount = 1

    fun isTriangle(p: Long): Boolean {
        while (triangleList.last() < p)
            calculateNextTriangle()

        return triangleList.contains(p)
    }

    private fun calculateNextTriangle() {
        triangleCount++
        triangleList.add(triangleCount * (triangleCount + 1L) / 2L)
    }

    fun isPentagonal(p: Long): Boolean {
        while (pentagonList.last() < p)
            calculateNextPentagon()

        return pentagonList.contains(p)
    }

    private fun calculateNextPentagon() {
        pentaCount++
        pentagonList.add(pentaCount * (3L * pentaCount - 1L) / 2L)
    }

    fun isHexagonal(p: Long): Boolean {
        while (hexagonList.last() < p)
            calculateNextHexagon()

        return hexagonList.contains(p)
    }

    private fun calculateNextHexagon() {
        hexaCount++
        hexagonList.add(hexaCount * (2L * hexaCount - 1L))
    }

    fun echoAllInAll(){
        while (true){
            calculateNextTriangle()
            val candidate = triangleList.last()
            if(isPentagonal(candidate) && isHexagonal(candidate))
                println(candidate)
        }
    }
}