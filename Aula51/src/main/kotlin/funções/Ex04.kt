package funções

fun main() {
    println("A área do retângulo é: ${calcularAreaRentagulo()}")
}

fun calcularAreaRentagulo(): Double{
    print("Digite a base: ")
    val base = readln().toDouble()

    print("Digite a altura: ")
    val altura = readln().toDouble()

    return base * altura
}