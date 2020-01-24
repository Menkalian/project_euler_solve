fun main() {
    var sum: Long = 0
    for (i in 1..999) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    println(sum)
}