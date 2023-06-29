package ex02

class Idade {
    companion object {
        fun calculaDias() {
            print("Digite a sua idade: ")
            val idade = readln().toInt()
            println("A quantidade aproximada de dias é: " + idade * 365)
        }
    }
}