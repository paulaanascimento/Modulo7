package gerais

fun main() {
    print("Quantos números deseja digitar? ")
    val quantidade = readln().toInt()

    val vetor = IntArray(quantidade)

    for(i in vetor.indices){
        print("Digite o ${i+1}º número: ")
        vetor[i] = readln().toInt()
    }

    println("O menor número é: ${menorNumero(vetor)}")
}

fun menorNumero(vetor : IntArray) : Int{
    var menor = vetor[0]

    for(i in vetor.indices){
        if(vetor[i] < menor){
            menor = vetor[i]
        }
    }

    return menor
}