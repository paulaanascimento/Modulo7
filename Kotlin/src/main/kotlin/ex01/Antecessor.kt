package ex01

class Antecessor {
    companion object {
        fun mostraAntecessor() {
            print("Digite um número inteiro: ")
            val num = readln().toInt()
            println("O antecessor é: " + (num-1))
        }
    }
}