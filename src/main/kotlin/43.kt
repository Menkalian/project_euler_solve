import utils.getIthPrime
import java.util.*

fun main() {
    var sum = 0L

    for (a in 0..9) {
        for (b in 0..9) {
            if (b == a) continue
            for (c in 0..9) {
                if (b == c || a == c) continue
                for (d in 0..9) {
                    if (c == d || d == b || d == a) continue
                    for (e in 0..9) {
                        if (e == a || e == b || e == c || e == d) continue
                        for (f in 0..9) {
                            if (f == a || f == b || f == c || f == d || f == e) continue
                            for (g in 0..9) {
                                if (g == a || g == b || g == c || g == d || g == e || g == f) continue
                                for (h in 0..9) {
                                    if (h == a || h == b || h == c || h == d || h == e || h == f || h == g) continue
                                    for (i in 0..9) {
                                        if (i == a || i == b || i == c || i == d || i == e || i == f || i == g || i == h) continue
                                        for(j in 0..9) {
                                            if (j == a || j == b || j == c || j == d || j == e || j == f || j == g || j == h || j == i) continue

                                            sum += checkProperty(arrayOf(a, b, c, d, e, f, g, h, i, j))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    println(sum)

    println(checkProperty(arrayOf(1,4,0,6,3,5,7,2,8,9)))

}

fun checkProperty(digits: Array<Int>): Long {
    for(i in 1..7){
        val num = digits[i] * 100 + digits[i+1] * 10 + digits[i+2]
        val prime = getIthPrime(i.toLong())
        if((num % prime) != 0L) {
            return 0
        }
    }

    var toRet = 0L
    val reverseDig = digits.reversedArray()
    for(e in digits.size-1 downTo 0){
        toRet += reverseDig[e] * Math.pow(10.0, e.toDouble()).toLong()
    }
    println("$toRet was accepted!")
    return toRet
}
