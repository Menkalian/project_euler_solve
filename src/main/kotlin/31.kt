val maxVals_31 = arrayOf(200, 100, 40, 20, 10, 4, 2, 1)

val multiplyVals_31 = arrayOf(1, 2, 5, 10, 20, 50, 100, 200)

fun main() {
    var count = 0
    for (a in 0..maxVals_31[0])
        for (b in 0..maxVals_31[1])
            for (c in 0..maxVals_31[2])
                for (d in 0..maxVals_31[3])
                    for (e in 0..maxVals_31[4])
                        for (f in 0..maxVals_31[5])
                            for (g in 0..maxVals_31[6])
                                for (h in 0..maxVals_31[7])
                                    if (a * multiplyVals_31[0] + b * multiplyVals_31[1] + c * multiplyVals_31[2] + d * multiplyVals_31[3] + e * multiplyVals_31[4] + f * multiplyVals_31[5] + g * multiplyVals_31[6] + h * multiplyVals_31[7] == 200)
                                        count++

    println(count)
}