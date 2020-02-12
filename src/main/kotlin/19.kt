import java.time.DayOfWeek
import java.time.format.DateTimeFormatter

fun main(){
    var sum = 0
    for(i in 1..100){
        for(j in 1..12){
            val d = java.time.LocalDate.of(1900+i,j,1)
            if(d.dayOfWeek == DayOfWeek.SUNDAY) {
                sum++
                println(d.format(DateTimeFormatter.BASIC_ISO_DATE))
            }
        }
    }
    println(sum)
}