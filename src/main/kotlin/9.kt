fun main(){
    for(a in 1..1000){
        for(b in 1..1000){
            for(c in 1..1000){
                if(a+b+c != 1000)
                    continue
                if(a*a + b*b == c*c){
                    val d = a*b*c
                    println("a:$a, b:$b, c:$c; d:$d")
                    return
                }
            }
        }
    }
}