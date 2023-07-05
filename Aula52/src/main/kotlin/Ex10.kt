fun main() {
    print("Digite um número inteiro: ")
    val x = readln().toInt()

    print("Digite outro número inteiro: ")
    val y = readln().toInt()

    compararNumeros(x,y)
}

fun compararNumeros(x:Int, y:Int){
    if(x == y){
        println("Os números são iguais!")
    } else println("Os números não são iguais!")
}