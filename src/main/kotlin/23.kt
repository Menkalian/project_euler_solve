fun main() {
    // First calculate the needed abundant Numbers
    val abundants: MutableList<Int> = mutableListOf()
    for (i in 12..28123) {
        if (getDivSum(i) > i) {
            abundants.add(i)
        }
    }
    val numb = abundants.size - 1
    var sum = 0L

    loop@ for (k in 1..28123) {
        for (i in 0..numb) {
            if (abundants.contains(k - abundants[i])) {
                continue@loop
            }
        }
        sum += k
    }

    println(sum)
}