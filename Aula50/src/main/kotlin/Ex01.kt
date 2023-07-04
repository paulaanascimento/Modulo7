class Ex01 {
    companion object {
        fun somarValoresVetor() {
            val vetor = IntArray(5)
            var soma = 0
            for(i: Int in 0..4){
                print("Digite um numero inteiro: ")
                vetor[i] = readln().toInt()
                soma+=vetor[i]
            }
            println("A soma dos números é: $soma")
        }
    }
}