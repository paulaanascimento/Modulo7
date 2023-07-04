package gerais

fun main() {
    println("A temperatura convertida em Fahrenheit é: ${converterParaFahrenheit()}")
}
fun converterParaFahrenheit(): Double{
    print("Digite a temperatura em graus Celsius: ")
    return (9 * readln().toDouble() + 160)/5
}