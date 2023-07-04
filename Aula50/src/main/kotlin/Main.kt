import Exercícios.*

fun main() {
    var continua = true
    do{
        println("\nDigite o número do exercício (1 a 12) ou 0 caso queira encerrar o programa")
        when(readln().toInt()){
            0 -> continua = false
            1 -> Ex01.somarValoresVetor()
            2 -> Ex02.informarDia()
            3 -> Ex03.repetirMensagem()
            4 -> Ex04.exibirNumerosPares()
            5 -> Ex05.listaCompras()
            6 -> Ex06.musicaBanda()
            7 -> Ex07.calcularMedia()
            8 -> Ex08.fibonacci()
            9 -> Ex09.calcularNumeros()
            10 -> Ex10.somar()
            11 -> Ex11.media()
            12 -> Ex12.linhaTempo()
            else -> println("Opção Inválida")
        }
    }while (continua)
}