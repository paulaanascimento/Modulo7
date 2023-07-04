package gerais

fun main() {
    print("Digite a quantidade de alunos: ")
    val quantidade = readln().toInt()

    val nomes = arrayOfNulls<String>(quantidade)
    val notas = DoubleArray(quantidade * 3)

    for(i in nomes.indices){
        print("\nDigite o nome do ${i+1}º aluno: ")
        nomes[i] = readln()

        for(j in 0 until 3){
            print("Digite a nota dele na ${j+1}º prova: ")
            notas[i * 3 + j] = readln().toDouble()
        }
    }

    println("")
    calcularMedia(nomes, notas)
}

fun calcularMedia(nomes: Array<String?>, notas: DoubleArray){
    for (i in nomes.indices) {
        val media = notas.sliceArray(i * 3 until (i + 1) * 3).sum() / 3
        println("Aluno: ${nomes[i]}\t- Média: $media")
    }
}