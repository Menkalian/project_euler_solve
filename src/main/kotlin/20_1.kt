val str_20 = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"

fun main(){
    var sum = 0L
    for(c in str_20){
        sum += c.toInt() - '0'.toInt()
    }
    println(sum)
}