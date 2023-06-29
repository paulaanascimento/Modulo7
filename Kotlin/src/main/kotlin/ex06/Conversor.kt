package ex06

class Conversor {
    companion object {
        fun converterDolarEmReal() {
            print("Digite um valor em dólar: ")
            val valor = readln().toDouble()
            println("O valor em reais é: " + valor*4.86)
        }
    }
}