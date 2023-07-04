package Exercícios

class Ex09 {
    companion object{
        fun calcularNumeros(){
            print("Digite o primeiro número: ")
            val x = readln().toInt()

            print("Digite o segundo número: ")
            val y = readln().toInt()

            println("\nEssas são as opções\n" +
                    "\t1 - Somar\n" +
                    "\t2 - Subtrair\n" +
                    "\t3 - Multiplicar\n" +
                    "\t4 - Didivir\n")
            print("Digite o número correspondente à opção escolhida: ")

            when(readln().toInt()){
                1 -> println(x+y)
                2 -> println(x-y)
                3 -> println(x*y)
                4 -> println(x/y)
                else -> println("Opção Inválida")
            }
        }
    }
}