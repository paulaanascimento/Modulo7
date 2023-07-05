fun main() {
    print("Digite um número inteiro: ")
    preencherVetorDobro(readln().toInt())
}

fun preencherVetorDobro(x:Int){
    val vetor = IntArray(10)
    vetor[0] = x

    for(i:Int in 1 ..9){
        vetor[i] = vetor[i-1] * 2
    }

    print(vetor.contentToString())
}