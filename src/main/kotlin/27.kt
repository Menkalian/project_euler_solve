import utils.Factorizer

fun main(){
    val factorizer = Factorizer()
    var record = 0
    var record_a = 0
    var record_b = 0

    for(a in -999..999){
        for(b in -1000..1000){
            var n = 0
            var count = 0
            while(factorizer.numberOfFactors(f(n,a,b)) == 1L){
                count ++
                n++
            }
            if(count > record){
                record = count
                record_a = a
                record_b = b
            }
        }
    }

    println("Größter Konsekutive Folge für a=$record_a und b=$record_b. Das Produkt ist ${record_a*record_b}")
}

fun f(n: Int, a: Int, b:Int) : Long{
    return (n*n + a*n + b).toLong()
}