fun main() {
    print("Digite o seu nome completo: ")
    palavraEmCadaLinha(readln())
}

fun palavraEmCadaLinha(nome:String){
    val vetor = nome.split(" ")
    vetor.forEach{ palavra -> println(palavra) }
}