package ex10

class Sucessor {
    companion object {
        fun mostraSucessor() {
            print("Digite um número inteiro: ")
            val num = readln().toInt()
            println("O sucessor é: " + (num+1))
        }
    }
}