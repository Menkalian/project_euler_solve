import java.io.File
import java.util.*

fun main(){
    val scanner: Scanner = Scanner(File("22.txt"))
    var names: MutableList<String> = scanner.nextLine()?.split(",")!!.toMutableList()
    names.sort()
    var sum = 0L
    for(i in 0..names.size-1){
        var temp = 0
        for(c in names[i]){
            temp += c.toInt() - 'A'.toInt() + 1
        }
        temp *= (i+1)
        sum += temp
        println("${i}th name ${names[i]} got a score of ${temp/(i+1)}. This is a total score of $temp. Current Sum: $sum")
    }

    println(sum)
}