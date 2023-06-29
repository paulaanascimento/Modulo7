package ex07

class Retangulo {
    companion object {
        fun calcularArea() {
            print("Digite a base: ")
            val base = readln().toDouble()

            print("Digite a altura: ")
            val altura = readln().toDouble()

            println("A área do retângulo é: " + base * altura)
        }
    }
}