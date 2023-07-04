package Exercícios

class Ex11 {
    companion object{
        fun media(){
            val vetor = IntArray(15)

            for(i in vetor.indices){
                print("Digite o ${i+1}º número: ")
                vetor[i] = readln().toInt()
            }

            println("\nA média dos números é: ${vetor.average()}")
        }
    }
}