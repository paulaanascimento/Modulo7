package funções

fun main() {
    println("A somatória dos números no intervalo indicado é ${somarNumero()}")
}

fun somarNumero():Int{
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    var soma = 0

    if(numero >=0){
        for(i in 1 .. numero){
            soma+= i
        }
    } else {
        for(i in 1 downTo  numero){
            soma+= i
        }
    }

    return soma
}