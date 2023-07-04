import ex01.Antecessor
import ex02.Idade
import ex03.Multiplo
import ex04.Temperatura
import ex05.ClassificaNumero
import ex06.Conversor
import ex07.Retangulo
import ex08.Variaveis
import ex09.Mensagem
import ex10.Sucessor

fun main(){
    var continua = true
    do{
        println("\nDigite o número do exercício (1 a 10) ou 0 caso queira encerrar o programa")
        when(readln().toInt()){
            0 -> continua = false
            1 -> Antecessor.mostraAntecessor()
            2 -> Idade.calculaDias()
            3 -> Multiplo.ehMultiploDeCinco()
            4 -> Temperatura.mostraClima()
            5 -> ClassificaNumero.classificarNumero()
            6 -> Conversor.converterDolarEmReal()
            7 -> Retangulo.calcularArea()
            8 -> Variaveis.trocarValores()
            9 -> Mensagem.imprimirMensagemUsuario()
            10 -> Sucessor.mostraSucessor()
            else -> println("Opção Inválida")
        }
    }while (continua)
    
}