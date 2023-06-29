package ex03

class Multiplo {
    companion object {
        fun ehMultiploDeCinco() {
            print("Digite um numero inteiro: ")
            val x = readln().toInt()
            println("O numero informado é multiplo de 5? " + (x%5 == 0))
        }
    }
}