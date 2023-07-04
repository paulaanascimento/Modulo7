package Exercícios

class Ex08 {
    companion object{
        fun fibonacci(){
            print("Digite um número: ")
            val x = readln().toInt()

            var n1 = 0
            var n2 = 1
            var fib = 0

            if(x == 0){
                println("Fibonacci($x) = $n1")
            } else if(x == 1){
                println("Fibonacci($x) = $n2")
            } else if (x < 0){
                println("Número Inválido")
            } else {
                var i = 2
                while(i <= x){
                    fib = n1 + n2
                    val aux = n1
                    n1 = n2
                    n2 = aux + n1
                    i++
                }
                println("Fibonacci($x) = $fib")
            }
        }
    }
}