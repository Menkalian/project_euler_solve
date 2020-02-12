fun main() {
    for (i in 1..Long.MAX_VALUE) {
        var b = true
        for (j in 1..20) {
            b = b && i % j == 0L
            if (!b)
                break
        }
        if (b) {
            println(i)
            return
        }
    }
}