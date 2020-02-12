fun main(){
    var sum = 0L

    println("220 -> ${getDivSum(220)} -> ${getDivSum(getDivSum(220))}")
    println("284 -> ${getDivSum(284)} -> ${getDivSum(getDivSum(284))}")
    println("1184 -> ${getDivSum(1184)} -> ${getDivSum(getDivSum(1184))}")
    println("1210 -> ${getDivSum(1210)} -> ${getDivSum(getDivSum(1210))}")
    println("2620 -> ${getDivSum(2620)} -> ${getDivSum(getDivSum(2620))}")
    println("2924 -> ${getDivSum(2924)} -> ${getDivSum(getDivSum(2924))}")
    println("5020 -> ${getDivSum(5020)} -> ${getDivSum(getDivSum(5020))}")
    println("5564 -> ${getDivSum(5564)} -> ${getDivSum(getDivSum(5564))}")
    println("6232 -> ${getDivSum(6232)} -> ${getDivSum(getDivSum(6232))}")
    println("6368 -> ${getDivSum(6368)} -> ${getDivSum(getDivSum(6368))}")

    for( i  in 2..10000){
        val Ds = getDivSum(i)
        if(Ds!=i && i == getDivSum(Ds)){
            sum += i
            println("println(\"$i -> \${getDivSum($i)} -> \${getDivSum(getDivSum($i))}\")")

        }
    }

    println(sum)
}

fun getDivSum(f:Int):Int{
    var sum = 0
    for(i in 1..(f-1))
        if(f%i == 0){
            sum += i
        }
    return sum
}