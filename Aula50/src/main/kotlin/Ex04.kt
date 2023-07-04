class Ex04 {
    companion object{
        fun exibirNumerosPares(){
            var vetor = IntArray(10)
            for(i: Int in 0 .. 9){
                print("Digite um numero inteiro: ")
                vetor[i] = readln().toInt()
            }

            print("\nOs números pares são: ")
            for(i: Int in 0 .. 9){
                if(vetor[i]%2 == 0) {
                    print("${vetor[i]} ")
                }
            }
        }
    }
}