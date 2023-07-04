package gerais

fun main() {
    print("Digite um número: ")
    val num1 = readln().toDouble()

    print("Digite outro número: ")
    val num2 = readln().toDouble()

    println("\nSoma: ${somar(num1, num2)}")
    println("Subtração: ${subtrair(num1, num2)}")
    println("Multiplicação: ${multiplicar(num1, num2)}")
    println("Divisão: ${dividir(num1, num2)}")
}
fun somar(num1:Double, num2:Double):Double{
    return num1 + num2
}
fun subtrair(num1:Double, num2:Double):Double{
    return num1 - num2
}
fun multiplicar(num1:Double, num2:Double):Double{
    return num1 * num2
}
fun dividir(num1:Double, num2:Double):Double{
    return num1 / num2
}