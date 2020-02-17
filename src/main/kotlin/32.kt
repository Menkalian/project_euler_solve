var count_32 = 0L
val LoE_32 : MutableList<Equation> = mutableListOf()

fun main() {
    for (t in 1..9)
        for (eq in t+1..8)
            for (a in 1..8) {
                for (b in 1..9) {
                    if (b == a) continue
                    for (c in 1..9) {
                        if (b == c || a == c) continue
                        for (d in 1..9) {
                            if (c == d || d == b || d == a) continue
                            for (e in 1..9) {
                                if (e == a || e == b || e == c || e == d) continue
                                for (f in 1..9) {
                                    if (f == a || f == b || f == c || f == d || f == e) continue
                                    for (g in 1..9) {
                                        if (g == a || g == b || g == c || g == d || g == e || g == f) continue
                                        for (h in 1..9) {
                                            if (h == a || h == b || h == c || h == d || h == e || h == f || h == g) continue
                                            for (i in 1..9) {
                                                if (i == a || i == b || i == c || i == d || i == e || i == f || i == g || i == h) continue

                                                    checkCount(arrayOf(a,b,c,d,e,f,g,h,i), t, eq);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    println(count_32)
}

fun checkCount(nums: Array<Int>, t: Int, eq: Int) {
    var mult_1 = 0
    var mult_2 = 0
    var prod = 0

    for(i in 0 until t){
        mult_1 *= 10
        mult_1 += nums[i]
    }
    for(i in t until eq){
        mult_2 *= 10
        mult_2 += nums[i]
    }
    for(i in eq until nums.size){
        prod *= 10
        prod += nums[i]
    }

    if(mult_1 * mult_2 == prod){
        val equate = Equation(p1 = mult_1, p2 = mult_2, res = prod)
        if(!LoE_32.contains(equate)){
            count_32+=prod
            LoE_32.add(equate)
            println("$mult_1 * $mult_2 = $prod")
        }
    }
}

class Equation(val p1: Int, val p2: Int, val res: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Equation
        if (res != other.res) return false
//        if (p1 != other.p1 && p1 != other.p2) return false // If one multiplier matches -> Equation matches // Occluded here for Reasons of Wording in the task

        return true
    }

    override fun hashCode(): Int {
        var result = p1
        result = 31 * result + p2
        result = 31 * result + res
        return result
    }
}
