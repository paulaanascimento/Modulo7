package ex08

class Variaveis {
    companion object {
        fun trocarValores() {
            print("Digite o valor de x: ")
            var x = readln().toInt()

            print("Digite o valor de y: ")
            var y = readln().toInt()

            val aux = x
            x = y
            y = aux

            println("Trocando os valores fica: X = " + x + " e Y = " + y)
        }
    }
}