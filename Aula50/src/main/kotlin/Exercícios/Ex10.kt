package Exercícios

class Ex10 {
    companion object{
        fun somar(){
            val vetor = IntArray(15)

            var i = 0
            var j = 1
            do{
                vetor[i] = j
                i++
                j++
            }while(i < 15)

            println("\nA soma dos números é: ${vetor.sum()}")
        }
    }
}