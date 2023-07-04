package Exercícios

class Ex06 {
    companion object{
        fun musicaBanda(){
            print("Digite o nome da banda: ")
            val nome = readln()

            val musicas = arrayOfNulls<String>(3)

            for(i: Int in musicas.indices){
                print("Digite a ${i+1} primeira musica: ")
                musicas[i] = readln()
            }

            println("\n$nome")
            musicas.forEach { musica -> println(musica) }
        }
    }
}