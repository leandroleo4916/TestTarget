fun main() {
    val numE = 378
    var numI = 0
    var numJ = 1
    var aux = 0
    var value = false

    while (!value) {
        if (numE > numJ) {
            aux = numI + numJ
            numI = numJ
            numJ = aux
            println("$numJ")
        }else {
            value = true
        }
    }
    
    if (numJ == numE){
        println("$numE faz parte do Fibonacci")
    }
    else {
        println("$numE não faz parte do Fibonacci")
    }
}
