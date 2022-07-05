package com.example.testestarget

import java.sql.DriverManager.println

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
    
    val calculo = MainCalculos()
    calculo.addValue()

    val calculoMenor = calculo.calculaMenor()
    val calculoMaior = calculo.calculaMaior()
    val calculoMedia = calculo.calculaMedia()
    val percentualSp = calculo.percentualSp()
    val percentualRj = calculo.percentualRj()
    val percentualMg = calculo.percentualMg()
    val percentualEs = calculo.percentualEs()
    val percentualOutros = calculo.percentualOutros()

    println("$calculoMenor")
    println("$calculoMaior")
    println("$calculoMedia")
    println("$percentualSp")
    println("$percentualRj")
    println("$percentualMg")
    println("$percentualEs")
    println("$percentualOutros")
    
}
