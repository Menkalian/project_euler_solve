package utils

fun getPrimesTill(tar: Long): List<Long> { // Vllt. Erasthosteles ansatz statt 2d warten....
    val list: MutableList<Long> = mutableListOf(2)
    for (i in 3..tar) {
        var b = false
        for (a in list) {
            b = i % a == 0L
            if (b) break
        }
        if (!b)
            list.add(i)
    }
    return list
}

fun isPrime(tar: Long): Boolean {
    return getPrimesTill(tar).contains(tar)
}

fun getFactors(tar: Long): List<Long> {
    val factors = getPrimesTill(tar)
    if (factors.contains(tar))
        return listOf(tar)
    return getFactors(tar, factors)
}

fun getIthPrime(tar: Long): Long {
    val list: MutableList<Long> = mutableListOf(2)
    var i = 3L
    while (list.size < tar){
        var prime = true
        for (a in list) {
            prime = i % a != 0L
            if (!prime) break
        }
        if (prime)
            list.add(i)
        i++

    }
    return list.last()
}

class Factorizer {
    val factors: MutableList<Long> = mutableListOf(2)

    fun displayFactors(number: Long) {
        if (number == 1L)
            println("Finish")
        // Use Existing Primes
        for (it in factors) {
            if (number % it == 0L) {
                println("Factor: $it")
                // Reduce by found Factor
                displayFactors(number / it)
                return
            }
        }

        // calculate further Primes until a possible Factor matches. Just calculate until number/3 since 2 is confirmed not a factor
        for (i in factors.last()..number) {
            var prime = true

            for (it in factors)
                if (i % it == 0L) { // Multiple of Prime -> Not Prime
                    prime = false
                    break
                }

            // Add to known Primes
            if (prime)
                factors.add(i)

            // Check for Factor
            if (number % i == 0L) {
                println("Factor: $i")
                // Reduce by found Factor
                displayFactors(number / i)
                return
            }
        }
    }
}

private fun getFactors(tar: Long, factors: List<Long>): List<Long> {
    if (tar == 1L) {
        return listOf()
    }
    for (it in factors) {
        if (tar % it == 0L) {
            val toRet = mutableListOf(it)
            toRet.addAll(getFactors(tar / it, factors))
            return toRet
        }
    }
    println("1 wurde fehlerhaft(!!!) als Faktor festgestellt!!!")
    return listOf(1L)
}
