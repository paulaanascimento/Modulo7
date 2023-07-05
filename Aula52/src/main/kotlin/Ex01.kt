fun main() {
    print("Digite um número inteiro: ")
    val x = readln().toInt()

    print("Digite outro número inteiro: ")
    val y = readln().toInt()

    println("O resultado da soma é ${somarNaoMultiplosDeTreze(x,y)}")
}

fun somarNaoMultiplosDeTreze(x:Int, y:Int):Int{
    var soma = 0

    if(x > y){
        for(i:Int in y .. x){
            if(i%13 != 0){
                soma += i
            }
        }
    } else {
        for(i:Int in x .. y){
            if(i%13 != 0){
                soma += i
            }
        }
    }

    return soma
}