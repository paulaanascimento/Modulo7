package ex05

class ClassificaNumero {
    companion object {
        fun classificarNumero() {
            print("Digite um número: ")
            val num = readln().toDouble()

            if(num < 0){
                println("O número é negativo")
            } else if(num > 0){
                println("O número é positivo")
            } else println("O número é neutro")
        }
    }
}