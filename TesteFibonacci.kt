fun main() {
    
    val numIn = 378
    var numI = 0
    var numJ = 1
    var aux = 0
    var value = false

    while (!value) {
        if (numIn > numJ) {
            aux = numI + numJ
            numI = numJ
            numJ = aux
        }else {
            value = true
        }
    }
    
    if (numJ == numIn){
        println("$numIn faz parte do Fibonacci")
    }
    else {
        println("$numIn não faz parte do Fibonacci")
    }
    
}
