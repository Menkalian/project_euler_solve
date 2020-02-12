val digitArr = arrayOf("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
val tenArr = arrayOf("", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
val hundo = "hundred"
val thous = "thousand"
val and = "and"
val exeptions = mapOf(
    Pair(11, "eleven"),
    Pair(12, "twelve"),
    Pair(13, "thirteen"),
    Pair(14, "fourteen"),
    Pair(15, "fifteen"),
    Pair(16, "sixteen"),
    Pair(17, "seventeen"),
    Pair(18, "eighteen"),
    Pair(19, "nineteen")
)

fun main() {

    var sum = 0L
    for (i in 1..1000) {
        sum += count(i)
    }
    println(sum)
}

fun count(i:Int):Int{
    if (exeptions.containsKey(i)) {
        return exeptions[i]?.length!!
    } else
        if (i < 10) {
            return digitArr[i].length
        } else
            if (i < 100) {
                return digitArr[i % 10].length + tenArr[i / 10].length
            } else
                if (i < 1000) {
                    var ten = count(i%100)
                    if(i%100 != 0) ten += and.length
                    return ten + hundo.length + digitArr[i / 100].length
                } else {
                    return "onethousand".length
                }
}