fun main(){
    println(calcWayNum(20,0,0))

}

fun calcWayNum(n: Long, i: Long, j: Long): Long {
    if( i == n || j == n) return 1L //only one way once at a wall
    return calcWayNum(n,i+1,j) + calcWayNum(n, i, j+1)
}
