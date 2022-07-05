package com.example.testestarget

import java.util.*

class MainCalculos {

    private val list: ArrayList<Element> = ArrayList()
    private var total = 0.0

    fun addValue(){
        adicionaValor(1, 22174.1664)
        adicionaValor(2, 24537.6698)
        adicionaValor(3, 26139.6134)
        adicionaValor(4, 0.0)
        adicionaValor(5, 0.0)
        adicionaValor(6, 26742.6612)
        adicionaValor(7, 0.0)
        adicionaValor(8, 42889.2258)
        adicionaValor(9, 46251.174)
        adicionaValor(10, 11191.4722)
        adicionaValor(11, 0.0)
        adicionaValor(12, 0.0)
        adicionaValor(13, 3847.4823)
        adicionaValor(14, 373.7838)
        adicionaValor(15, 2659.7563)
        adicionaValor(16, 48924.2448)
        adicionaValor(17, 18419.2614)
        adicionaValor(18, 0.0)
        adicionaValor(19, 0.0)
        adicionaValor(20, 35240.1826)
        adicionaValor(21, 43829.1667)
        adicionaValor(22, 18235.6852)
        adicionaValor(23, 4355.0662)
        adicionaValor(24, 13327.1025)
        adicionaValor(25, 0.0)
        adicionaValor(26, 0.0)
        adicionaValor(27, 25681.8318)
        adicionaValor(28, 1718.1221)
        adicionaValor(29, 13220.495)
        adicionaValor(30, 8414.61)
    }

    fun adicionaValor(dia: Int, valor: Double){
        list.add(Element(dia, valor))
    }

    fun calculaMenor(): Double{

        var valorMenor = 0.0
        for (i in list){
            if (i.valor != 0.0) {
                if (valorMenor != 0.0) {
                    if (valorMenor > i.valor){
                        valorMenor = i.valor
                    }
                }
                else {
                    valorMenor = i.valor
                }
            }
        }
        return valorMenor
    }

    fun calculaMaior(): Double{

        var valorMaior = 0.0
        for (i in list){
            if (i.valor != 0.0) {
                if (valorMaior != 0.0) {
                    if (valorMaior < i.valor){
                        valorMaior = i.valor
                    }
                }
                else {
                    valorMaior = i.valor
                }
            }
        }
        return valorMaior
    }

    fun calculaMedia(): Double{

        var div = 0
        for (i in list){
            if (i.valor != 0.0) {
                if (total != 0.0) {
                    total += i.valor
                    div ++
                }
                else {
                    total = i.valor
                }
            }
        }
        return total / div
    }

    fun percentualSp(): Double{
        val sp = 67836.43
        return 100 / (total / sp)
    }
    fun percentualRj(): Double{
        val rj = 36678.66
        return  100 / (total / rj)
    }
    fun percentualMg(): Double{
        val mg = 29229.88
        return 100 / (total / mg)
    }
    fun percentualEs(): Double{
        val es = 27165.48
        return  100 / (total / es)
    }
    fun percentualOutros(): Double{
        val outros = 19849.53
        return 100 / (total / outros)
    }
}
