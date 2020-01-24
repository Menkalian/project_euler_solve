fun main() {
    val i: MutableList<Int> = mutableListOf(1, 1)
    while (i.last() <= 4_000_000) {
        val ind = i.lastIndex
        i.add(i[ind] + i[ind - 1])
    }

    var sum = 0
    i.filter { a -> a % 2 == 0 }.forEach { a -> sum += a }

    println(sum)
}